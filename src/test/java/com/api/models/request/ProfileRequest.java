package com.api.models.request;

public class ProfileRequest {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;

    private ProfileRequest(String firstName, String lastName, String mobileNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    // ✅ Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    // Builder pattern
    public static class Builder {
        private String firstName;
        private String lastName;
        private String mobileNumber;
        private String email;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public ProfileRequest build() {
            return new ProfileRequest(firstName, lastName, mobileNumber, email);
        }
    }
}
