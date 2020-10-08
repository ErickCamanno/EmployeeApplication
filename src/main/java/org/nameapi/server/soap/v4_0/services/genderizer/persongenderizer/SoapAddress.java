/**
 * SoapAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapAddress  implements java.io.Serializable {
    private java.lang.String[] addressLines;

    private java.lang.String country;

    private java.lang.String placeName;

    private java.lang.String pobox;

    private java.lang.String postalCode;

    private java.lang.String region;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapStreetInfo streetInfo;

    public SoapAddress() {
    }

    public SoapAddress(
           java.lang.String[] addressLines,
           java.lang.String country,
           java.lang.String placeName,
           java.lang.String pobox,
           java.lang.String postalCode,
           java.lang.String region,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapStreetInfo streetInfo) {
           this.addressLines = addressLines;
           this.country = country;
           this.placeName = placeName;
           this.pobox = pobox;
           this.postalCode = postalCode;
           this.region = region;
           this.streetInfo = streetInfo;
    }


    /**
     * Gets the addressLines value for this SoapAddress.
     * 
     * @return addressLines
     */
    public java.lang.String[] getAddressLines() {
        return addressLines;
    }


    /**
     * Sets the addressLines value for this SoapAddress.
     * 
     * @param addressLines
     */
    public void setAddressLines(java.lang.String[] addressLines) {
        this.addressLines = addressLines;
    }

    public java.lang.String getAddressLines(int i) {
        return this.addressLines[i];
    }

    public void setAddressLines(int i, java.lang.String _value) {
        this.addressLines[i] = _value;
    }


    /**
     * Gets the country value for this SoapAddress.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this SoapAddress.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the placeName value for this SoapAddress.
     * 
     * @return placeName
     */
    public java.lang.String getPlaceName() {
        return placeName;
    }


    /**
     * Sets the placeName value for this SoapAddress.
     * 
     * @param placeName
     */
    public void setPlaceName(java.lang.String placeName) {
        this.placeName = placeName;
    }


    /**
     * Gets the pobox value for this SoapAddress.
     * 
     * @return pobox
     */
    public java.lang.String getPobox() {
        return pobox;
    }


    /**
     * Sets the pobox value for this SoapAddress.
     * 
     * @param pobox
     */
    public void setPobox(java.lang.String pobox) {
        this.pobox = pobox;
    }


    /**
     * Gets the postalCode value for this SoapAddress.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this SoapAddress.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the region value for this SoapAddress.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this SoapAddress.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the streetInfo value for this SoapAddress.
     * 
     * @return streetInfo
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapStreetInfo getStreetInfo() {
        return streetInfo;
    }


    /**
     * Sets the streetInfo value for this SoapAddress.
     * 
     * @param streetInfo
     */
    public void setStreetInfo(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapStreetInfo streetInfo) {
        this.streetInfo = streetInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapAddress)) return false;
        SoapAddress other = (SoapAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressLines==null && other.getAddressLines()==null) || 
             (this.addressLines!=null &&
              java.util.Arrays.equals(this.addressLines, other.getAddressLines()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.placeName==null && other.getPlaceName()==null) || 
             (this.placeName!=null &&
              this.placeName.equals(other.getPlaceName()))) &&
            ((this.pobox==null && other.getPobox()==null) || 
             (this.pobox!=null &&
              this.pobox.equals(other.getPobox()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.streetInfo==null && other.getStreetInfo()==null) || 
             (this.streetInfo!=null &&
              this.streetInfo.equals(other.getStreetInfo())));
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
        if (getAddressLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPlaceName() != null) {
            _hashCode += getPlaceName().hashCode();
        }
        if (getPobox() != null) {
            _hashCode += getPobox().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getStreetInfo() != null) {
            _hashCode += getStreetInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pobox");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pobox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streetInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapStreetInfo"));
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
