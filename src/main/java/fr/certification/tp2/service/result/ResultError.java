package fr.certification.tp2.service.result;

public class ResultError implements Result {
    private String error;

    public ResultError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String message) {
        this.error = message;
    }
}
