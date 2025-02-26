package com.expertsystem.expertsystem;

public class CandidateInfo {
    private boolean hasPythonCW;
    private boolean hasSoftwareEngineeringCW;
    private boolean hasAgileCW;
    private boolean hasBachelors;
    private int pythonYears;
    private int dataYears;
    private boolean hasAgileXP;
    private boolean hasGitXP;
    private int pmYears;
    private boolean hasPMICertification;
    private int expertSystemYears;
    private boolean hasMasters;

    public CandidateInfo() {}

    // Constructor with all fields
    public CandidateInfo(boolean hasPythonCW, boolean hasSoftwareEngineeringCW, boolean hasAgileCW, boolean hasBachelors,
                         int pythonYears, int dataYears, boolean hasAgileXP, boolean hasGitXP, int pmYears,
                         boolean hasPMICertification, int expertSystemYears, boolean hasMasters) {
        this.hasPythonCW = hasPythonCW;
        this.hasSoftwareEngineeringCW = hasSoftwareEngineeringCW;
        this.hasAgileCW = hasAgileCW;
        this.hasBachelors = hasBachelors;
        this.pythonYears = pythonYears;
        this.dataYears = dataYears;
        this.hasAgileXP = hasAgileXP;
        this.hasGitXP = hasGitXP;
        this.pmYears = pmYears;
        this.hasPMICertification = hasPMICertification;
        this.expertSystemYears = expertSystemYears;
        this.hasMasters = hasMasters;
    }

    // Getters and Setters
    public boolean isHasPythonCW() {
        return hasPythonCW;
    }

    public void setHasPythonCW(boolean hasPythonCW) {
        this.hasPythonCW = hasPythonCW;
    }

    public boolean isHasSoftwareEngineeringCW() {
        return hasSoftwareEngineeringCW;
    }

    public void setHasSoftwareEngineeringCW(boolean hasSoftwareEngineeringCW) {
        this.hasSoftwareEngineeringCW = hasSoftwareEngineeringCW;
    }

    public boolean isHasAgileCW() {
        return hasAgileCW;
    }

    public void setHasAgileCW(boolean hasAgileCW) {
        this.hasAgileCW = hasAgileCW;
    }

    public boolean isHasBachelors() {
        return hasBachelors;
    }

    public void setHasBachelors(boolean hasBachelors) {
        this.hasBachelors = hasBachelors;
    }

    public int getPythonYears() {
        return pythonYears;
    }

    public void setPythonYears(int pythonYears) {
        this.pythonYears = pythonYears;
    }

    public int getDataYears() {
        return dataYears;
    }

    public void setDataYears(int dataYears) {
        this.dataYears = dataYears;
    }

    public boolean isHasAgileXP() {
        return hasAgileXP;
    }

    public void setHasAgileXP(boolean hasAgileXP) {
        this.hasAgileXP = hasAgileXP;
    }

    public boolean isHasGitXP() {
        return hasGitXP;
    }

    public void setHasGitXP(boolean hasGitXP) {
        this.hasGitXP = hasGitXP;
    }

    public int getPmYears() {
        return pmYears;
    }

    public void setPmYears(int pmYears) {
        this.pmYears = pmYears;
    }

    public boolean isHasPMICertification() {
        return hasPMICertification;
    }

    public void setHasPMICertification(boolean hasPMICertification) {
        this.hasPMICertification = hasPMICertification;
    }

    public int getExpertSystemYears() {
        return expertSystemYears;
    }

    public void setExpertSystemYears(int expertSystemYears) {
        this.expertSystemYears = expertSystemYears;
    }

    public boolean isHasMasters() {
        return hasMasters;
    }

    public void setHasMasters(boolean hasMasters) {
        this.hasMasters = hasMasters;
    }

    @Override
    public String toString() {
        return "CandidateInfo{" +
                "hasPythonCW=" + hasPythonCW +
                ", hasSoftwareEngineeringCW=" + hasSoftwareEngineeringCW +
                ", hasAgileCW=" + hasAgileCW +
                ", hasBachelors=" + hasBachelors +
                ", pythonYears=" + pythonYears +
                ", dataYears=" + dataYears +
                ", hasAgileXP=" + hasAgileXP +
                ", hasGitXP=" + hasGitXP +
                ", pmYears=" + pmYears +
                ", hasPMICertification=" + hasPMICertification +
                ", expertSystemYears=" + expertSystemYears +
                ", hasMasters=" + hasMasters +
                '}';
    }
}