import React, { useState } from 'react';
import axios from 'axios';

const EvaluateForm = () => {
    const [formData, setFormData] = useState({
        hasPythonCW: false,
        hasSoftwareEngineeringCW: false,
        hasAgileCW: false,
        hasBachelors: false,
        pythonYears: 0,
        dataYears: 0,
        hasAgileXP: false,
        hasGitXP: false,
        pmYears: 0,
        hasPMICertification: false,
        expertSystemYears: 0,
        hasMasters: false
    });

    const [result, setResult] = useState('');

    const handleChange = (e) => {
        const { name, value, type, checked } = e.target;
        setFormData({
            ...formData,
            [name]: type === 'checkbox' ? checked : value
        });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        console.log('Form submitted:', formData); // Debugging statement
        try {
            const response = await axios.post('http://localhost:8080/api/expert-system/evaluate', formData);
            console.log('API response:', response.data); // Debugging statement
            setResult(response.data);
        } catch (error) {
            console.error('Error evaluating candidate:', error);
        }
    };

    const renderResult = () => {
        if (!result) return null;

        const resultMessages = result.split('\n').filter(message => message.trim() !== '');

        return resultMessages.map((message, index) => (
            <div key={index} className="alert alert-success mt-3">
                {message}
            </div>
        ));
    };

    return (
        <div className="container mt-5">
            <h2>Preliminary Questionaire</h2>
            <form onSubmit={handleSubmit}>
                <div className="form-check">
                    <input type="checkbox" className="form-check-input" name="hasPythonCW" checked={formData.hasPythonCW} onChange={handleChange} />
                    <label className="form-check-label">Has Python Coursework</label>
                </div>
                <div className="form-check">
                    <input type="checkbox" className="form-check-input" name="hasSoftwareEngineeringCW" checked={formData.hasSoftwareEngineeringCW} onChange={handleChange} />
                    <label className="form-check-label">Has Software Engineering Coursework</label>
                </div>
                <div className="form-check">
                    <input type="checkbox" className="form-check-input" name="hasAgileCW" checked={formData.hasAgileCW} onChange={handleChange} />
                    <label className="form-check-label">Has Agile Coursework</label>
                </div>
                <div className="form-check">
                    <input type="checkbox" className="form-check-input" name="hasBachelors" checked={formData.hasBachelors} onChange={handleChange} />
                    <label className="form-check-label">Has Bachelors</label>
                </div>
                <div className="form-group">
                    <label>Python Years</label>
                    <input type="number" className="form-control" name="pythonYears" value={formData.pythonYears} onChange={handleChange} />
                </div>
                <div className="form-group">
                    <label>Data Years</label>
                    <input type="number" className="form-control" name="dataYears" value={formData.dataYears} onChange={handleChange} />
                </div>
                <div className="form-check">
                    <input type="checkbox" className="form-check-input" name="hasAgileXP" checked={formData.hasAgileXP} onChange={handleChange} />
                    <label className="form-check-label">Has Agile Experience</label>
                </div>
                <div className="form-check">
                    <input type="checkbox" className="form-check-input" name="hasGitXP" checked={formData.hasGitXP} onChange={handleChange} />
                    <label className="form-check-label">Has Git Experience</label>
                </div>
                <div className="form-group">
                    <label>PM Years</label>
                    <input type="number" className="form-control" name="pmYears" value={formData.pmYears} onChange={handleChange} />
                </div>
                <div className="form-check">
                    <input type="checkbox" className="form-check-input" name="hasPMICertification" checked={formData.hasPMICertification} onChange={handleChange} />
                    <label className="form-check-label">Has PMI Certification</label>
                </div>
                <div className="form-group">
                    <label>Expert System Years</label>
                    <input type="number" className="form-control" name="expertSystemYears" value={formData.expertSystemYears} onChange={handleChange} />
                </div>
                <div className="form-check">
                    <input type="checkbox" className="form-check-input" name="hasMasters" checked={formData.hasMasters} onChange={handleChange} />
                    <label className="form-check-label">Has Masters</label>
                </div>
                <button type="submit" className="btn btn-primary mt-3">Evaluate</button>
            </form>
            {renderResult()}
        </div>
    );
};

export default EvaluateForm;