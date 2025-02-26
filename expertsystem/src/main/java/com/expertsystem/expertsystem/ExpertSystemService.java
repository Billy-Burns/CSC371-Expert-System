package com.expertsystem.expertsystem;

import org.springframework.stereotype.Service;

@Service
public class ExpertSystemService {
    public String evaluateCandidateQualifications(CandidateInfo info) {
        StringBuilder result = new StringBuilder();

        if (info.isHasPythonCW() && info.isHasSoftwareEngineeringCW() && info.isHasBachelors()) {
            result.append("Congratulations! You qualify for the Entry-Level Python Engineer position. Your application has been accepted to be interviewed for the position qualified.\n");
            result.append("Reason: You have the required Python and Software Engineering course work, and a Bachelor's in CS.\n");
            if (info.isHasAgileCW()) {
                result.append("You also have Agile course work which is a plus!\n");
            }
        }

        // Python Engineer
        if (info.getPythonYears() >= 3 && info.getDataYears() >= 1 && info.isHasAgileXP() && info.isHasBachelors()) {
            result.append("Congratulations! You qualify for the Python Engineer position. Your application has been accepted to be interviewed for the position qualified.\n");
            result.append("Reason: You meet the experience requirements in Python and data development, have Agile experience, and a Bachelor's in CS.\n");
            if (info.isHasGitXP()) {
                result.append("You also have Git experience which is a plus!\n");
            }
        }

        // Project Manager
        if (info.getPmYears() >= 3 && info.isHasAgileXP()) {
            result.append("Congratulations! You qualify for the Project Manager position. Your application has been accepted to be interviewed for the position qualified.\n");
            result.append("Reason: You have the required years of experience in managing software projects and Agile experience.\n");
            if (info.isHasPMICertification()) {
                result.append("You also have the desired PMI Lean Project Management Certification, which is a plus!\n");
            }
        }

        // Senior Knowledge Engineer
        if (info.getExpertSystemYears() >= 3 && info.getDataYears() >= 2 && info.isHasMasters()) {
            result.append("Congratulations! You qualify for the Senior Knowledge Engineer position. Your application has been accepted to be interviewed for the position qualified.\n");
            result.append("Reason: You have the required experience in Python Expert Systems and data architecture, and a Master's in CS.\n");
        }

        // No qualification
        if (result.length() == 0) {
            result.append("We're sorry, but you don't currently qualify for any of the available positions. Your application has unfortunately been rejected.\n");
            result.append("Reason: Your qualifications don't meet the minimum requirements for the open positions.\n");
        }

        return result.toString();
    }
}