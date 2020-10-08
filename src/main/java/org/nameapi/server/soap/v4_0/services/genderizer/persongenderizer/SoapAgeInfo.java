/**
 * SoapAgeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapAgeInfo  implements java.io.Serializable {
    private java.lang.Integer birthDay;

    private java.lang.Integer birthMonth;

    private java.lang.Integer birthYear;

    private java.lang.Integer[] birthYearRange;

    public SoapAgeInfo() {
    }

    public SoapAgeInfo(
           java.lang.Integer birthDay,
           java.lang.Integer birthMonth,
           java.lang.Integer birthYear,
           java.lang.Integer[] birthYearRange) {
           this.birthDay = birthDay;
           this.birthMonth = birthMonth;
           this.birthYear = birthYear;
           this.birthYearRange = birthYearRange;
    }


    /**
     * Gets the birthDay value for this SoapAgeInfo.
     * 
     * @return birthDay
     */
    public java.lang.Integer getBirthDay() {
        return birthDay;
    }


    /**
     * Sets the birthDay value for this SoapAgeInfo.
     * 
     * @param birthDay
     */
    public void setBirthDay(java.lang.Integer birthDay) {
        this.birthDay = birthDay;
    }


    /**
     * Gets the birthMonth value for this SoapAgeInfo.
     * 
     * @return birthMonth
     */
    public java.lang.Integer getBirthMonth() {
        return birthMonth;
    }


    /**
     * Sets the birthMonth value for this SoapAgeInfo.
     * 
     * @param birthMonth
     */
    public void setBirthMonth(java.lang.Integer birthMonth) {
        this.birthMonth = birthMonth;
    }


    /**
     * Gets the birthYear value for this SoapAgeInfo.
     * 
     * @return birthYear
     */
    public java.lang.Integer getBirthYear() {
        return birthYear;
    }


    /**
     * Sets the birthYear value for this SoapAgeInfo.
     * 
     * @param birthYear
     */
    public void setBirthYear(java.lang.Integer birthYear) {
        this.birthYear = birthYear;
    }


    /**
     * Gets the birthYearRange value for this SoapAgeInfo.
     * 
     * @return birthYearRange
     */
    public java.lang.Integer[] getBirthYearRange() {
        return birthYearRange;
    }


    /**
     * Sets the birthYearRange value for this SoapAgeInfo.
     * 
     * @param birthYearRange
     */
    public void setBirthYearRange(java.lang.Integer[] birthYearRange) {
        this.birthYearRange = birthYearRange;
    }

    public java.lang.Integer getBirthYearRange(int i) {
        return this.birthYearRange[i];
    }

    public void setBirthYearRange(int i, java.lang.Integer _value) {
        this.birthYearRange[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapAgeInfo)) return false;
        SoapAgeInfo other = (SoapAgeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.birthDay==null && other.getBirthDay()==null) || 
             (this.birthDay!=null &&
              this.birthDay.equals(other.getBirthDay()))) &&
            ((this.birthMonth==null && other.getBirthMonth()==null) || 
             (this.birthMonth!=null &&
              this.birthMonth.equals(other.getBirthMonth()))) &&
            ((this.birthYear==null && other.getBirthYear()==null) || 
             (this.birthYear!=null &&
              this.birthYear.equals(other.getBirthYear()))) &&
            ((this.birthYearRange==null && other.getBirthYearRange()==null) || 
             (this.birthYearRange!=null &&
              java.util.Arrays.equals(this.birthYearRange, other.getBirthYearRange())));
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
        if (getBirthDay() != null) {
            _hashCode += getBirthDay().hashCode();
        }
        if (getBirthMonth() != null) {
            _hashCode += getBirthMonth().hashCode();
        }
        if (getBirthYear() != null) {
            _hashCode += getBirthYear().hashCode();
        }
        if (getBirthYearRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBirthYearRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBirthYearRange(), i);
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
        new org.apache.axis.description.TypeDesc(SoapAgeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapAgeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthYearRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthYearRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
