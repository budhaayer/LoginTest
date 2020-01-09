package com.sofsee.logintest1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class LoginResponse {

    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("status_code")
    @Expose
    private Integer statusCode;
    @SerializedName("message")
    @Expose
    private String message;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public class Data {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("registered_ip")
        @Expose
        private String registeredIp;
        @SerializedName("email_verified")
        @Expose
        private String emailVerified;
        @SerializedName("code")
        @Expose
        private Object code;
        @SerializedName("user_profile")
        @Expose
        private UserProfile userProfile;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getRegisteredIp() {
            return registeredIp;
        }

        public void setRegisteredIp(String registeredIp) {
            this.registeredIp = registeredIp;
        }

        public String getEmailVerified() {
            return emailVerified;
        }

        public void setEmailVerified(String emailVerified) {
            this.emailVerified = emailVerified;
        }

        public Object getCode() {
            return code;
        }

        public void setCode(Object code) {
            this.code = code;
        }

        public UserProfile getUserProfile() {
            return userProfile;
        }

        public void setUserProfile(UserProfile userProfile) {
            this.userProfile = userProfile;
        }

        public class UserProfile {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("full_name")
            @Expose
            private String fullName;
            @SerializedName("profile_image")
            @Expose
            private String profileImage;
            @SerializedName("full_address")
            @Expose
            private Object fullAddress;
            @SerializedName("mobile")
            @Expose
            private String mobile;
            @SerializedName("mobile_verified")
            @Expose
            private String mobileVerified;
            @SerializedName("created_at")
            @Expose
            private String createdAt;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public String getProfileImage() {
                return profileImage;
            }

            public void setProfileImage(String profileImage) {
                this.profileImage = profileImage;
            }

            public Object getFullAddress() {
                return fullAddress;
            }

            public void setFullAddress(Object fullAddress) {
                this.fullAddress = fullAddress;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getMobileVerified() {
                return mobileVerified;
            }

            public void setMobileVerified(String mobileVerified) {
                this.mobileVerified = mobileVerified;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

        }

    }
}
