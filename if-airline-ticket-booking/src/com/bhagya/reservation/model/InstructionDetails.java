package com.bhagya.reservation.model;

public class InstructionDetails {
    private String Instruction;
    private String TermsAndCondition;
    private String AgreeAndContinue;

    @Override
    public String toString() {
        return "InstructionDetails{" +
                "Instruction='" + Instruction + '\'' +
                ", TermsAndCondition='" + TermsAndCondition + '\'' +
                ", AgreeAndContinue='" + AgreeAndContinue + '\'' +
                '}';
    }

    public String getInstruction() {
        return Instruction;
    }

    public void setInstruction(String instruction) {
        Instruction = instruction;
    }

    public String getTermsAndCondition() {
        return TermsAndCondition;
    }

    public void setTermsAndCondition(String termsAndCondition) {
        TermsAndCondition = termsAndCondition;
    }

    public String getAgreeAndContinue() {
        return AgreeAndContinue;
    }

    public void setAgreeAndContinue(String agreeAndContinue) {
        AgreeAndContinue = agreeAndContinue;
    }
}
