/**
 * SoapAddressRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapAddressRelation  implements java.io.Serializable {
    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddress address;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.AddressUsage[] specificUsage;

    private boolean usageForAll;

    public SoapAddressRelation() {
    }

    public SoapAddressRelation(
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddress address,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.AddressUsage[] specificUsage,
           boolean usageForAll) {
           this.address = address;
           this.specificUsage = specificUsage;
           this.usageForAll = usageForAll;
    }


    /**
     * Gets the address value for this SoapAddressRelation.
     * 
     * @return address
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this SoapAddressRelation.
     * 
     * @param address
     */
    public void setAddress(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAddress address) {
        this.address = address;
    }


    /**
     * Gets the specificUsage value for this SoapAddressRelation.
     * 
     * @return specificUsage
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.AddressUsage[] getSpecificUsage() {
        return specificUsage;
    }


    /**
     * Sets the specificUsage value for this SoapAddressRelation.
     * 
     * @param specificUsage
     */
    public void setSpecificUsage(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.AddressUsage[] specificUsage) {
        this.specificUsage = specificUsage;
    }

    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.AddressUsage getSpecificUsage(int i) {
        return this.specificUsage[i];
    }

    public void setSpecificUsage(int i, org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.AddressUsage _value) {
        this.specificUsage[i] = _value;
    }


    /**
     * Gets the usageForAll value for this SoapAddressRelation.
     * 
     * @return usageForAll
     */
    public boolean isUsageForAll() {
        return usageForAll;
    }


    /**
     * Sets the usageForAll value for this SoapAddressRelation.
     * 
     * @param usageForAll
     */
    public void setUsageForAll(boolean usageForAll) {
        this.usageForAll = usageForAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapAddressRelation)) return false;
        SoapAddressRelation other = (SoapAddressRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.specificUsage==null && other.getSpecificUsage()==null) || 
             (this.specificUsage!=null &&
              java.util.Arrays.equals(this.specificUsage, other.getSpecificUsage()))) &&
            this.usageForAll == other.isUsageForAll();
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getSpecificUsage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecificUsage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecificUsage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isUsageForAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapAddressRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapAddressRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specificUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "addressUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageForAll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageForAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
