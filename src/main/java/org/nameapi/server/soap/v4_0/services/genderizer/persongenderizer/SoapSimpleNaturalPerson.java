/**
 * SoapSimpleNaturalPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapSimpleNaturalPerson  implements java.io.Serializable {
    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddressRelation[] addresses;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAgeInfo ageInfo;

    private java.lang.String correspondenceLanguage;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapEmailAddress[] emailAddresses;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.StoragePersonGender gender;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.MaritalStatus maritalStatus;

    private java.lang.String[] nationalities;

    private java.lang.String[] nativeLanguages;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapNameField[] personName;

    private java.lang.String religion;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapTelNumber[] telNumbers;

    private java.lang.String[] titles;

    public SoapSimpleNaturalPerson() {
    }

    public SoapSimpleNaturalPerson(
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddressRelation[] addresses,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAgeInfo ageInfo,
           java.lang.String correspondenceLanguage,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapEmailAddress[] emailAddresses,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.StoragePersonGender gender,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.MaritalStatus maritalStatus,
           java.lang.String[] nationalities,
           java.lang.String[] nativeLanguages,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapNameField[] personName,
           java.lang.String religion,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapTelNumber[] telNumbers,
           java.lang.String[] titles) {
           this.addresses = addresses;
           this.ageInfo = ageInfo;
           this.correspondenceLanguage = correspondenceLanguage;
           this.emailAddresses = emailAddresses;
           this.gender = gender;
           this.maritalStatus = maritalStatus;
           this.nationalities = nationalities;
           this.nativeLanguages = nativeLanguages;
           this.personName = personName;
           this.religion = religion;
           this.telNumbers = telNumbers;
           this.titles = titles;
    }


    /**
     * Gets the addresses value for this SoapSimpleNaturalPerson.
     * 
     * @return addresses
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddressRelation[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this SoapSimpleNaturalPerson.
     * 
     * @param addresses
     */
    public void setAddresses(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddressRelation[] addresses) {
        this.addresses = addresses;
    }

    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddressRelation getAddresses(int i) {
        return this.addresses[i];
    }

    public void setAddresses(int i, org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddressRelation _value) {
        this.addresses[i] = _value;
    }


    /**
     * Gets the ageInfo value for this SoapSimpleNaturalPerson.
     * 
     * @return ageInfo
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAgeInfo getAgeInfo() {
        return ageInfo;
    }


    /**
     * Sets the ageInfo value for this SoapSimpleNaturalPerson.
     * 
     * @param ageInfo
     */
    public void setAgeInfo(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAgeInfo ageInfo) {
        this.ageInfo = ageInfo;
    }


    /**
     * Gets the correspondenceLanguage value for this SoapSimpleNaturalPerson.
     * 
     * @return correspondenceLanguage
     */
    public java.lang.String getCorrespondenceLanguage() {
        return correspondenceLanguage;
    }


    /**
     * Sets the correspondenceLanguage value for this SoapSimpleNaturalPerson.
     * 
     * @param correspondenceLanguage
     */
    public void setCorrespondenceLanguage(java.lang.String correspondenceLanguage) {
        this.correspondenceLanguage = correspondenceLanguage;
    }


    /**
     * Gets the emailAddresses value for this SoapSimpleNaturalPerson.
     * 
     * @return emailAddresses
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapEmailAddress[] getEmailAddresses() {
        return emailAddresses;
    }


    /**
     * Sets the emailAddresses value for this SoapSimpleNaturalPerson.
     * 
     * @param emailAddresses
     */
    public void setEmailAddresses(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapEmailAddress[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapEmailAddress getEmailAddresses(int i) {
        return this.emailAddresses[i];
    }

    public void setEmailAddresses(int i, org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapEmailAddress _value) {
        this.emailAddresses[i] = _value;
    }


    /**
     * Gets the gender value for this SoapSimpleNaturalPerson.
     * 
     * @return gender
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.StoragePersonGender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this SoapSimpleNaturalPerson.
     * 
     * @param gender
     */
    public void setGender(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.StoragePersonGender gender) {
        this.gender = gender;
    }


    /**
     * Gets the maritalStatus value for this SoapSimpleNaturalPerson.
     * 
     * @return maritalStatus
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this SoapSimpleNaturalPerson.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the nationalities value for this SoapSimpleNaturalPerson.
     * 
     * @return nationalities
     */
    public java.lang.String[] getNationalities() {
        return nationalities;
    }


    /**
     * Sets the nationalities value for this SoapSimpleNaturalPerson.
     * 
     * @param nationalities
     */
    public void setNationalities(java.lang.String[] nationalities) {
        this.nationalities = nationalities;
    }

    public java.lang.String getNationalities(int i) {
        return this.nationalities[i];
    }

    public void setNationalities(int i, java.lang.String _value) {
        this.nationalities[i] = _value;
    }


    /**
     * Gets the nativeLanguages value for this SoapSimpleNaturalPerson.
     * 
     * @return nativeLanguages
     */
    public java.lang.String[] getNativeLanguages() {
        return nativeLanguages;
    }


    /**
     * Sets the nativeLanguages value for this SoapSimpleNaturalPerson.
     * 
     * @param nativeLanguages
     */
    public void setNativeLanguages(java.lang.String[] nativeLanguages) {
        this.nativeLanguages = nativeLanguages;
    }

    public java.lang.String getNativeLanguages(int i) {
        return this.nativeLanguages[i];
    }

    public void setNativeLanguages(int i, java.lang.String _value) {
        this.nativeLanguages[i] = _value;
    }


    /**
     * Gets the personName value for this SoapSimpleNaturalPerson.
     * 
     * @return personName
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapNameField[] getPersonName() {
        return personName;
    }


    /**
     * Sets the personName value for this SoapSimpleNaturalPerson.
     * 
     * @param personName
     */
    public void setPersonName(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapNameField[] personName) {
        this.personName = personName;
    }


    /**
     * Gets the religion value for this SoapSimpleNaturalPerson.
     * 
     * @return religion
     */
    public java.lang.String getReligion() {
        return religion;
    }


    /**
     * Sets the religion value for this SoapSimpleNaturalPerson.
     * 
     * @param religion
     */
    public void setReligion(java.lang.String religion) {
        this.religion = religion;
    }


    /**
     * Gets the telNumbers value for this SoapSimpleNaturalPerson.
     * 
     * @return telNumbers
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapTelNumber[] getTelNumbers() {
        return telNumbers;
    }


    /**
     * Sets the telNumbers value for this SoapSimpleNaturalPerson.
     * 
     * @param telNumbers
     */
    public void setTelNumbers(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapTelNumber[] telNumbers) {
        this.telNumbers = telNumbers;
    }

    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapTelNumber getTelNumbers(int i) {
        return this.telNumbers[i];
    }

    public void setTelNumbers(int i, org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapTelNumber _value) {
        this.telNumbers[i] = _value;
    }


    /**
     * Gets the titles value for this SoapSimpleNaturalPerson.
     * 
     * @return titles
     */
    public java.lang.String[] getTitles() {
        return titles;
    }


    /**
     * Sets the titles value for this SoapSimpleNaturalPerson.
     * 
     * @param titles
     */
    public void setTitles(java.lang.String[] titles) {
        this.titles = titles;
    }

    public java.lang.String getTitles(int i) {
        return this.titles[i];
    }

    public void setTitles(int i, java.lang.String _value) {
        this.titles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapSimpleNaturalPerson)) return false;
        SoapSimpleNaturalPerson other = (SoapSimpleNaturalPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.ageInfo==null && other.getAgeInfo()==null) || 
             (this.ageInfo!=null &&
              this.ageInfo.equals(other.getAgeInfo()))) &&
            ((this.correspondenceLanguage==null && other.getCorrespondenceLanguage()==null) || 
             (this.correspondenceLanguage!=null &&
              this.correspondenceLanguage.equals(other.getCorrespondenceLanguage()))) &&
            ((this.emailAddresses==null && other.getEmailAddresses()==null) || 
             (this.emailAddresses!=null &&
              java.util.Arrays.equals(this.emailAddresses, other.getEmailAddresses()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.nationalities==null && other.getNationalities()==null) || 
             (this.nationalities!=null &&
              java.util.Arrays.equals(this.nationalities, other.getNationalities()))) &&
            ((this.nativeLanguages==null && other.getNativeLanguages()==null) || 
             (this.nativeLanguages!=null &&
              java.util.Arrays.equals(this.nativeLanguages, other.getNativeLanguages()))) &&
            ((this.personName==null && other.getPersonName()==null) || 
             (this.personName!=null &&
              java.util.Arrays.equals(this.personName, other.getPersonName()))) &&
            ((this.religion==null && other.getReligion()==null) || 
             (this.religion!=null &&
              this.religion.equals(other.getReligion()))) &&
            ((this.telNumbers==null && other.getTelNumbers()==null) || 
             (this.telNumbers!=null &&
              java.util.Arrays.equals(this.telNumbers, other.getTelNumbers()))) &&
            ((this.titles==null && other.getTitles()==null) || 
             (this.titles!=null &&
              java.util.Arrays.equals(this.titles, other.getTitles())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAgeInfo() != null) {
            _hashCode += getAgeInfo().hashCode();
        }
        if (getCorrespondenceLanguage() != null) {
            _hashCode += getCorrespondenceLanguage().hashCode();
        }
        if (getEmailAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getNationalities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNationalities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNationalities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNativeLanguages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNativeLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNativeLanguages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersonName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersonName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersonName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReligion() != null) {
            _hashCode += getReligion().hashCode();
        }
        if (getTelNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapSimpleNaturalPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapSimpleNaturalPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapAddressRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapAgeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondenceLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correspondenceLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapEmailAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "storagePersonGender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "maritalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeLanguages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nativeLanguages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapNameField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "names"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("religion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "religion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapTelNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
