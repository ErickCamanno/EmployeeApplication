/**
 * SoapPersonGenderizerResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapPersonGenderizerResult  implements java.io.Serializable {
    private double confidence;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.ComputedPersonGender gender;

    private java.lang.Double maleProportion;

    public SoapPersonGenderizerResult() {
    }

    public SoapPersonGenderizerResult(
           double confidence,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.ComputedPersonGender gender,
           java.lang.Double maleProportion) {
           this.confidence = confidence;
           this.gender = gender;
           this.maleProportion = maleProportion;
    }


    /**
     * Gets the confidence value for this SoapPersonGenderizerResult.
     * 
     * @return confidence
     */
    public double getConfidence() {
        return confidence;
    }


    /**
     * Sets the confidence value for this SoapPersonGenderizerResult.
     * 
     * @param confidence
     */
    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }


    /**
     * Gets the gender value for this SoapPersonGenderizerResult.
     * 
     * @return gender
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.ComputedPersonGender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this SoapPersonGenderizerResult.
     * 
     * @param gender
     */
    public void setGender(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.ComputedPersonGender gender) {
        this.gender = gender;
    }


    /**
     * Gets the maleProportion value for this SoapPersonGenderizerResult.
     * 
     * @return maleProportion
     */
    public java.lang.Double getMaleProportion() {
        return maleProportion;
    }


    /**
     * Sets the maleProportion value for this SoapPersonGenderizerResult.
     * 
     * @param maleProportion
     */
    public void setMaleProportion(java.lang.Double maleProportion) {
        this.maleProportion = maleProportion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapPersonGenderizerResult)) return false;
        SoapPersonGenderizerResult other = (SoapPersonGenderizerResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.confidence == other.getConfidence() &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.maleProportion==null && other.getMaleProportion()==null) || 
             (this.maleProportion!=null &&
              this.maleProportion.equals(other.getMaleProportion())));
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
        _hashCode += new Double(getConfidence()).hashCode();
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getMaleProportion() != null) {
            _hashCode += getMaleProportion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapPersonGenderizerResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapPersonGenderizerResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "computedPersonGender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maleProportion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maleProportion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
