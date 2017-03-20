package com.progiants.bhamashahskilldevelopment.models;

import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.Expose;

/**
 * Created by Vishwajeet (vjs3)
 * on 21/3/17.
 */
public class HofDetails {

    @SerializedName("CATEGORY_DESC_ENG")
    @Expose
    private String cATEGORYDESCENG;
    @SerializedName("AADHAR_ID")
    @Expose
    private String aADHARID;
    @SerializedName("STATE")
    @Expose
    private String sTATE;
    @SerializedName("MOTHER_NAME_ENG")
    @Expose
    private String mOTHERNAMEENG;
    @SerializedName("HOUSE_NUMBER_ENG")
    @Expose
    private Object hOUSENUMBERENG;
    @SerializedName("RELATION_ENG")
    @Expose
    private String rELATIONENG;
    @SerializedName("DOB")
    @Expose
    private String dOB;
    @SerializedName("ECONOMIC_GROUP")
    @Expose
    private String eCONOMICGROUP;
    @SerializedName("BUILDING_NO_ENG")
    @Expose
    private Object bUILDINGNOENG;
    @SerializedName("BHAMASHAH_ID")
    @Expose
    private String bHAMASHAHID;
    @SerializedName("STREET_NAME_ENG")
    @Expose
    private Object sTREETNAMEENG;
    @SerializedName("IFSC_CODE")
    @Expose
    private String iFSCCODE;
    @SerializedName("M_ID")
    @Expose
    private String mID;
    @SerializedName("FAMILYIDNO")
    @Expose
    private String fAMILYIDNO;
    @SerializedName("PIN_CODE")
    @Expose
    private String pINCODE;
    @SerializedName("LANDLINE_NO")
    @Expose
    private Object lANDLINENO;
    @SerializedName("VILLAGE_NAME")
    @Expose
    private String vILLAGENAME;
    @SerializedName("GP_WARD")
    @Expose
    private String gPWARD;
    @SerializedName("EMAIL")
    @Expose
    private Object eMAIL;
    @SerializedName("SPOUCE_NAME_ENG")
    @Expose
    private String sPOUCENAMEENG;
    @SerializedName("IS_RURAL")
    @Expose
    private String iSRURAL;
    @SerializedName("DISTRICT")
    @Expose
    private String dISTRICT;
    @SerializedName("EDUCATION_DESC_ENG")
    @Expose
    private String eDUCATIONDESCENG;
    @SerializedName("ACC_NO")
    @Expose
    private String aCCNO;
    @SerializedName("ADDRESS")
    @Expose
    private String aDDRESS;
    @SerializedName("INCOME_DESC_ENG")
    @Expose
    private Object iNCOMEDESCENG;
    @SerializedName("BANK_NAME")
    @Expose
    private String bANKNAME;
    @SerializedName("LAND_MARK_ENG")
    @Expose
    private Object lANDMARKENG;
    @SerializedName("RATION_CARD_NO")
    @Expose
    private String rATIONCARDNO;
    @SerializedName("NAME_ENG")
    @Expose
    private String nAMEENG;
    @SerializedName("MOBILE_NO")
    @Expose
    private String mOBILENO;
    @SerializedName("GENDER")
    @Expose
    private String gENDER;
    @SerializedName("FATHER_NAME_ENG")
    @Expose
    private String fATHERNAMEENG;
    @SerializedName("FAX_NO")
    @Expose
    private Object fAXNO;
    @SerializedName("BLOCK_CITY")
    @Expose
    private String bLOCKCITY;

    public HofDetails(String eDUCATIONDESCENG) {
        this.eDUCATIONDESCENG = eDUCATIONDESCENG;
    }

    public String getCATEGORYDESCENG() {
        return cATEGORYDESCENG;
    }

    public void setCATEGORYDESCENG(String cATEGORYDESCENG) {
        this.cATEGORYDESCENG = cATEGORYDESCENG;
    }

    public String getAADHARID() {
        return aADHARID;
    }

    public void setAADHARID(String aADHARID) {
        this.aADHARID = aADHARID;
    }

    public String getSTATE() {
        return sTATE;
    }

    public void setSTATE(String sTATE) {
        this.sTATE = sTATE;
    }

    public String getMOTHERNAMEENG() {
        return mOTHERNAMEENG;
    }

    public void setMOTHERNAMEENG(String mOTHERNAMEENG) {
        this.mOTHERNAMEENG = mOTHERNAMEENG;
    }

    public Object getHOUSENUMBERENG() {
        return hOUSENUMBERENG;
    }

    public void setHOUSENUMBERENG(Object hOUSENUMBERENG) {
        this.hOUSENUMBERENG = hOUSENUMBERENG;
    }

    public String getRELATIONENG() {
        return rELATIONENG;
    }

    public void setRELATIONENG(String rELATIONENG) {
        this.rELATIONENG = rELATIONENG;
    }

    public String getDOB() {
        return dOB;
    }

    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    public String getECONOMICGROUP() {
        return eCONOMICGROUP;
    }

    public void setECONOMICGROUP(String eCONOMICGROUP) {
        this.eCONOMICGROUP = eCONOMICGROUP;
    }

    public Object getBUILDINGNOENG() {
        return bUILDINGNOENG;
    }

    public void setBUILDINGNOENG(Object bUILDINGNOENG) {
        this.bUILDINGNOENG = bUILDINGNOENG;
    }

    public String getBHAMASHAHID() {
        return bHAMASHAHID;
    }

    public void setBHAMASHAHID(String bHAMASHAHID) {
        this.bHAMASHAHID = bHAMASHAHID;
    }

    public Object getSTREETNAMEENG() {
        return sTREETNAMEENG;
    }

    public void setSTREETNAMEENG(Object sTREETNAMEENG) {
        this.sTREETNAMEENG = sTREETNAMEENG;
    }

    public String getIFSCCODE() {
        return iFSCCODE;
    }

    public void setIFSCCODE(String iFSCCODE) {
        this.iFSCCODE = iFSCCODE;
    }

    public String getMID() {
        return mID;
    }

    public void setMID(String mID) {
        this.mID = mID;
    }

    public String getFAMILYIDNO() {
        return fAMILYIDNO;
    }

    public void setFAMILYIDNO(String fAMILYIDNO) {
        this.fAMILYIDNO = fAMILYIDNO;
    }

    public String getPINCODE() {
        return pINCODE;
    }

    public void setPINCODE(String pINCODE) {
        this.pINCODE = pINCODE;
    }

    public Object getLANDLINENO() {
        return lANDLINENO;
    }

    public void setLANDLINENO(Object lANDLINENO) {
        this.lANDLINENO = lANDLINENO;
    }

    public String getVILLAGENAME() {
        return vILLAGENAME;
    }

    public void setVILLAGENAME(String vILLAGENAME) {
        this.vILLAGENAME = vILLAGENAME;
    }

    public String getGPWARD() {
        return gPWARD;
    }

    public void setGPWARD(String gPWARD) {
        this.gPWARD = gPWARD;
    }

    public Object getEMAIL() {
        return eMAIL;
    }

    public void setEMAIL(Object eMAIL) {
        this.eMAIL = eMAIL;
    }

    public String getSPOUCENAMEENG() {
        return sPOUCENAMEENG;
    }

    public void setSPOUCENAMEENG(String sPOUCENAMEENG) {
        this.sPOUCENAMEENG = sPOUCENAMEENG;
    }

    public String getISRURAL() {
        return iSRURAL;
    }

    public void setISRURAL(String iSRURAL) {
        this.iSRURAL = iSRURAL;
    }

    public String getDISTRICT() {
        return dISTRICT;
    }

    public void setDISTRICT(String dISTRICT) {
        this.dISTRICT = dISTRICT;
    }

    public String getEDUCATIONDESCENG() {
        return eDUCATIONDESCENG;
    }

    public void setEDUCATIONDESCENG(String eDUCATIONDESCENG) {
        this.eDUCATIONDESCENG = eDUCATIONDESCENG;
    }

    public String getACCNO() {
        return aCCNO;
    }

    public void setACCNO(String aCCNO) {
        this.aCCNO = aCCNO;
    }

    public String getADDRESS() {
        return aDDRESS;
    }

    public void setADDRESS(String aDDRESS) {
        this.aDDRESS = aDDRESS;
    }

    public Object getINCOMEDESCENG() {
        return iNCOMEDESCENG;
    }

    public void setINCOMEDESCENG(Object iNCOMEDESCENG) {
        this.iNCOMEDESCENG = iNCOMEDESCENG;
    }

    public String getBANKNAME() {
        return bANKNAME;
    }

    public void setBANKNAME(String bANKNAME) {
        this.bANKNAME = bANKNAME;
    }

    public Object getLANDMARKENG() {
        return lANDMARKENG;
    }

    public void setLANDMARKENG(Object lANDMARKENG) {
        this.lANDMARKENG = lANDMARKENG;
    }

    public String getRATIONCARDNO() {
        return rATIONCARDNO;
    }

    public void setRATIONCARDNO(String rATIONCARDNO) {
        this.rATIONCARDNO = rATIONCARDNO;
    }

    public String getNAMEENG() {
        return nAMEENG;
    }

    public void setNAMEENG(String nAMEENG) {
        this.nAMEENG = nAMEENG;
    }

    public String getMOBILENO() {
        return mOBILENO;
    }

    public void setMOBILENO(String mOBILENO) {
        this.mOBILENO = mOBILENO;
    }

    public String getGENDER() {
        return gENDER;
    }

    public void setGENDER(String gENDER) {
        this.gENDER = gENDER;
    }

    public String getFATHERNAMEENG() {
        return fATHERNAMEENG;
    }

    public void setFATHERNAMEENG(String fATHERNAMEENG) {
        this.fATHERNAMEENG = fATHERNAMEENG;
    }

    public Object getFAXNO() {
        return fAXNO;
    }

    public void setFAXNO(Object fAXNO) {
        this.fAXNO = fAXNO;
    }

    public String getBLOCKCITY() {
        return bLOCKCITY;
    }

    public void setBLOCKCITY(String bLOCKCITY) {
        this.bLOCKCITY = bLOCKCITY;
    }

}