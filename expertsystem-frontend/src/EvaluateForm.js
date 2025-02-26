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

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <label>
                    Has Python Coursework:
                    <input type="checkbox" name="hasPythonCW" checked={formData.hasPythonCW} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Has Software Engineering Coursework:
                    <input type="checkbox" name="hasSoftwareEngineeringCW" checked={formData.hasSoftwareEngineeringCW} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Has Agile Coursework:
                    <input type="checkbox" name="hasAgileCW" checked={formData.hasAgileCW} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Has Bachelors:
                    <input type="checkbox" name="hasBachelors" checked={formData.hasBachelors} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Python Years:
                    <input type="number" name="pythonYears" value={formData.pythonYears} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Data Years:
                    <input type="number" name="dataYears" value={formData.dataYears} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Has Agile Experience:
                    <input type="checkbox" name="hasAgileXP" checked={formData.hasAgileXP} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Has Git Experience:
                    <input type="checkbox" name="hasGitXP" checked={formData.hasGitXP} onChange={handleChange} />
                </label>
                <br />
                <label>
                    PM Years:
                    <input type="number" name="pmYears" value={formData.pmYears} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Has PMI Certification:
                    <input type="checkbox" name="hasPMICertification" checked={formData.hasPMICertification} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Expert System Years:
                    <input type="number" name="expertSystemYears" value={formData.expertSystemYears} onChange={handleChange} />
                </label>
                <br />
                <label>
                    Has Masters:
                    <input type="checkbox" name="hasMasters" checked={formData.hasMasters} onChange={handleChange} />
                </label>
                <br />
                <button type="submit">Evaluate</button>
            </form>
            {result && <div><h3>Result:</h3><p>{result}</p></div>}
        </div>
    );
};

export default EvaluateForm;