/**
 * SoapNameField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapNameField  implements java.io.Serializable {
    private java.lang.String fieldType;

    private java.lang.String string;

    public SoapNameField() {
    }

    public SoapNameField(
           java.lang.String fieldType,
           java.lang.String string) {
           this.fieldType = fieldType;
           this.string = string;
    }


    /**
     * Gets the fieldType value for this SoapNameField.
     * 
     * @return fieldType
     */
    public java.lang.String getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this SoapNameField.
     * 
     * @param fieldType
     */
    public void setFieldType(java.lang.String fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the string value for this SoapNameField.
     * 
     * @return string
     */
    public java.lang.String getString() {
        return string;
    }


    /**
     * Sets the string value for this SoapNameField.
     * 
     * @param string
     */
    public void setString(java.lang.String string) {
        this.string = string;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapNameField)) return false;
        SoapNameField other = (SoapNameField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.string==null && other.getString()==null) || 
             (this.string!=null &&
              this.string.equals(other.getString())));
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
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getString() != null) {
            _hashCode += getString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapNameField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapNameField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
