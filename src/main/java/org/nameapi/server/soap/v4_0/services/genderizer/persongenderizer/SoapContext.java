/**
 * SoapContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapContext  implements java.io.Serializable {
    private java.lang.String apiKey;

    private java.lang.String geo;

    private java.lang.String language;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Priority priority;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapContextPropertiesEntry[] properties;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.TextCase textCase;

    public SoapContext() {
    }

    public SoapContext(
           java.lang.String apiKey,
           java.lang.String geo,
           java.lang.String language,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Priority priority,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapContextPropertiesEntry[] properties,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.TextCase textCase) {
           this.apiKey = apiKey;
           this.geo = geo;
           this.language = language;
           this.priority = priority;
           this.properties = properties;
           this.textCase = textCase;
    }


    /**
     * Gets the apiKey value for this SoapContext.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this SoapContext.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the geo value for this SoapContext.
     * 
     * @return geo
     */
    public java.lang.String getGeo() {
        return geo;
    }


    /**
     * Sets the geo value for this SoapContext.
     * 
     * @param geo
     */
    public void setGeo(java.lang.String geo) {
        this.geo = geo;
    }


    /**
     * Gets the language value for this SoapContext.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this SoapContext.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the priority value for this SoapContext.
     * 
     * @return priority
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Priority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SoapContext.
     * 
     * @param priority
     */
    public void setPriority(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Priority priority) {
        this.priority = priority;
    }


    /**
     * Gets the properties value for this SoapContext.
     * 
     * @return properties
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapContextPropertiesEntry[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this SoapContext.
     * 
     * @param properties
     */
    public void setProperties(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapContextPropertiesEntry[] properties) {
        this.properties = properties;
    }


    /**
     * Gets the textCase value for this SoapContext.
     * 
     * @return textCase
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.TextCase getTextCase() {
        return textCase;
    }


    /**
     * Sets the textCase value for this SoapContext.
     * 
     * @param textCase
     */
    public void setTextCase(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.TextCase textCase) {
        this.textCase = textCase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapContext)) return false;
        SoapContext other = (SoapContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apiKey==null && other.getApiKey()==null) || 
             (this.apiKey!=null &&
              this.apiKey.equals(other.getApiKey()))) &&
            ((this.geo==null && other.getGeo()==null) || 
             (this.geo!=null &&
              this.geo.equals(other.getGeo()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties()))) &&
            ((this.textCase==null && other.getTextCase()==null) || 
             (this.textCase!=null &&
              this.textCase.equals(other.getTextCase())));
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
        if (getApiKey() != null) {
            _hashCode += getApiKey().hashCode();
        }
        if (getGeo() != null) {
            _hashCode += getGeo().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTextCase() != null) {
            _hashCode += getTextCase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "priority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", ">>soapContext>properties>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textCase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "textCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "textCase"));
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
