package cn.maixedu.zsb.model;

public class QuestionWithBLOBs extends Question {
    private byte[] title;

    private byte[] cqans;

    private byte[] jqans;

    private byte[] fbans;

    private byte[] saand;

    private byte[] options;

    private byte[] analysis;

    public byte[] getTitle() {
        return title;
    }

    public void setTitle(byte[] title) {
        this.title = title;
    }

    public byte[] getCqans() {
        return cqans;
    }

    public void setCqans(byte[] cqans) {
        this.cqans = cqans;
    }

    public byte[] getJqans() {
        return jqans;
    }

    public void setJqans(byte[] jqans) {
        this.jqans = jqans;
    }

    public byte[] getFbans() {
        return fbans;
    }

    public void setFbans(byte[] fbans) {
        this.fbans = fbans;
    }

    public byte[] getSaand() {
        return saand;
    }

    public void setSaand(byte[] saand) {
        this.saand = saand;
    }

    public byte[] getOptions() {
        return options;
    }

    public void setOptions(byte[] options) {
        this.options = options;
    }

    public byte[] getAnalysis() {
        return analysis;
    }

    public void setAnalysis(byte[] analysis) {
        this.analysis = analysis;
    }
}