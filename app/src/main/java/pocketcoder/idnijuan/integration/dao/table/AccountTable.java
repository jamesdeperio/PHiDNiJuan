package pocketcoder.idnijuan.integration.dao.table;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class AccountTable {
    @Id private String RFID;
    @Unique private String QRCode;
    @NotNull private String fName;
    @NotNull private String mName;
    @NotNull private String lName;
    @NotNull private String gender;
    @NotNull private String birthdate;
    @NotNull private String photoUrl;
    @NotNull private String SSS;
    @NotNull private String GSIS;
    @NotNull private String philhealth;
    @NotNull private String tin;
    @NotNull private String jobcategory;
    @NotNull private String occupation;

    @Generated(hash = 1296974276)
    public AccountTable(String RFID, String QRCode, @NotNull String fName,
            @NotNull String mName, @NotNull String lName, @NotNull String gender,
            @NotNull String birthdate, @NotNull String photoUrl,
            @NotNull String SSS, @NotNull String GSIS, @NotNull String philhealth,
            @NotNull String tin, @NotNull String jobcategory,
            @NotNull String occupation) {
        this.RFID = RFID;
        this.QRCode = QRCode;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.photoUrl = photoUrl;
        this.SSS = SSS;
        this.GSIS = GSIS;
        this.philhealth = philhealth;
        this.tin = tin;
        this.jobcategory = jobcategory;
        this.occupation = occupation;
    }

    @Generated(hash = 528739196)
    public AccountTable() {
    }

    @Override
    public String toString() {
        return "AccountTable{" +
                "RFID='" + RFID + '\'' +
                ", QRCode='" + QRCode + '\'' +
                ", fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", lName='" + lName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", SSS='" + SSS + '\'' +
                ", GSIS='" + GSIS + '\'' +
                ", philhealth='" + philhealth + '\'' +
                ", tin='" + tin + '\'' +
                ", jobcategory='" + jobcategory + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public String getRFID() {
        return this.RFID;
    }

    public void setRFID(String RFID) {
        this.RFID = RFID;
    }

    public String getQRCode() {
        return this.QRCode;
    }

    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }

    public String getFName() {
        return this.fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getMName() {
        return this.mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getLName() {
        return this.lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getSSS() {
        return this.SSS;
    }

    public void setSSS(String SSS) {
        this.SSS = SSS;
    }

    public String getGSIS() {
        return this.GSIS;
    }

    public void setGSIS(String GSIS) {
        this.GSIS = GSIS;
    }

    public String getPhilhealth() {
        return this.philhealth;
    }

    public void setPhilhealth(String philhealth) {
        this.philhealth = philhealth;
    }

    public String getTin() {
        return this.tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getJobcategory() {
        return this.jobcategory;
    }

    public void setJobcategory(String jobcategory) {
        this.jobcategory = jobcategory;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
