/**
 * Retry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class Retry  implements java.io.Serializable {
    private java.lang.Long retryInSeconds;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.RetryType retryType;

    public Retry() {
    }

    public Retry(
           java.lang.Long retryInSeconds,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.RetryType retryType) {
           this.retryInSeconds = retryInSeconds;
           this.retryType = retryType;
    }


    /**
     * Gets the retryInSeconds value for this Retry.
     * 
     * @return retryInSeconds
     */
    public java.lang.Long getRetryInSeconds() {
        return retryInSeconds;
    }


    /**
     * Sets the retryInSeconds value for this Retry.
     * 
     * @param retryInSeconds
     */
    public void setRetryInSeconds(java.lang.Long retryInSeconds) {
        this.retryInSeconds = retryInSeconds;
    }


    /**
     * Gets the retryType value for this Retry.
     * 
     * @return retryType
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.RetryType getRetryType() {
        return retryType;
    }


    /**
     * Sets the retryType value for this Retry.
     * 
     * @param retryType
     */
    public void setRetryType(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.RetryType retryType) {
        this.retryType = retryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Retry)) return false;
        Retry other = (Retry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retryInSeconds==null && other.getRetryInSeconds()==null) || 
             (this.retryInSeconds!=null &&
              this.retryInSeconds.equals(other.getRetryInSeconds()))) &&
            ((this.retryType==null && other.getRetryType()==null) || 
             (this.retryType!=null &&
              this.retryType.equals(other.getRetryType())));
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
        if (getRetryInSeconds() != null) {
            _hashCode += getRetryInSeconds().hashCode();
        }
        if (getRetryType() != null) {
            _hashCode += getRetryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Retry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "retry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retryInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "retryType"));
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
