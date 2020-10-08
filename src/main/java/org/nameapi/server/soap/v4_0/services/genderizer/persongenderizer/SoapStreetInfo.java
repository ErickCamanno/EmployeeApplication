/**
 * SoapStreetInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapStreetInfo  implements java.io.Serializable {
    private java.lang.String addressLine2;

    private java.lang.String apartment;

    private java.lang.String[] asLines;

    private java.lang.String asString;

    private java.lang.String building;

    private java.lang.String floor;

    private java.lang.String staircase;

    private java.lang.String streetName;

    private java.lang.String streetNameAndNumber;

    private java.lang.String streetNumber;

    public SoapStreetInfo() {
    }

    public SoapStreetInfo(
           java.lang.String addressLine2,
           java.lang.String apartment,
           java.lang.String[] asLines,
           java.lang.String asString,
           java.lang.String building,
           java.lang.String floor,
           java.lang.String staircase,
           java.lang.String streetName,
           java.lang.String streetNameAndNumber,
           java.lang.String streetNumber) {
           this.addressLine2 = addressLine2;
           this.apartment = apartment;
           this.asLines = asLines;
           this.asString = asString;
           this.building = building;
           this.floor = floor;
           this.staircase = staircase;
           this.streetName = streetName;
           this.streetNameAndNumber = streetNameAndNumber;
           this.streetNumber = streetNumber;
    }


    /**
     * Gets the addressLine2 value for this SoapStreetInfo.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this SoapStreetInfo.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the apartment value for this SoapStreetInfo.
     * 
     * @return apartment
     */
    public java.lang.String getApartment() {
        return apartment;
    }


    /**
     * Sets the apartment value for this SoapStreetInfo.
     * 
     * @param apartment
     */
    public void setApartment(java.lang.String apartment) {
        this.apartment = apartment;
    }


    /**
     * Gets the asLines value for this SoapStreetInfo.
     * 
     * @return asLines
     */
    public java.lang.String[] getAsLines() {
        return asLines;
    }


    /**
     * Sets the asLines value for this SoapStreetInfo.
     * 
     * @param asLines
     */
    public void setAsLines(java.lang.String[] asLines) {
        this.asLines = asLines;
    }

    public java.lang.String getAsLines(int i) {
        return this.asLines[i];
    }

    public void setAsLines(int i, java.lang.String _value) {
        this.asLines[i] = _value;
    }


    /**
     * Gets the asString value for this SoapStreetInfo.
     * 
     * @return asString
     */
    public java.lang.String getAsString() {
        return asString;
    }


    /**
     * Sets the asString value for this SoapStreetInfo.
     * 
     * @param asString
     */
    public void setAsString(java.lang.String asString) {
        this.asString = asString;
    }


    /**
     * Gets the building value for this SoapStreetInfo.
     * 
     * @return building
     */
    public java.lang.String getBuilding() {
        return building;
    }


    /**
     * Sets the building value for this SoapStreetInfo.
     * 
     * @param building
     */
    public void setBuilding(java.lang.String building) {
        this.building = building;
    }


    /**
     * Gets the floor value for this SoapStreetInfo.
     * 
     * @return floor
     */
    public java.lang.String getFloor() {
        return floor;
    }


    /**
     * Sets the floor value for this SoapStreetInfo.
     * 
     * @param floor
     */
    public void setFloor(java.lang.String floor) {
        this.floor = floor;
    }


    /**
     * Gets the staircase value for this SoapStreetInfo.
     * 
     * @return staircase
     */
    public java.lang.String getStaircase() {
        return staircase;
    }


    /**
     * Sets the staircase value for this SoapStreetInfo.
     * 
     * @param staircase
     */
    public void setStaircase(java.lang.String staircase) {
        this.staircase = staircase;
    }


    /**
     * Gets the streetName value for this SoapStreetInfo.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this SoapStreetInfo.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the streetNameAndNumber value for this SoapStreetInfo.
     * 
     * @return streetNameAndNumber
     */
    public java.lang.String getStreetNameAndNumber() {
        return streetNameAndNumber;
    }


    /**
     * Sets the streetNameAndNumber value for this SoapStreetInfo.
     * 
     * @param streetNameAndNumber
     */
    public void setStreetNameAndNumber(java.lang.String streetNameAndNumber) {
        this.streetNameAndNumber = streetNameAndNumber;
    }


    /**
     * Gets the streetNumber value for this SoapStreetInfo.
     * 
     * @return streetNumber
     */
    public java.lang.String getStreetNumber() {
        return streetNumber;
    }


    /**
     * Sets the streetNumber value for this SoapStreetInfo.
     * 
     * @param streetNumber
     */
    public void setStreetNumber(java.lang.String streetNumber) {
        this.streetNumber = streetNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapStreetInfo)) return false;
        SoapStreetInfo other = (SoapStreetInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.apartment==null && other.getApartment()==null) || 
             (this.apartment!=null &&
              this.apartment.equals(other.getApartment()))) &&
            ((this.asLines==null && other.getAsLines()==null) || 
             (this.asLines!=null &&
              java.util.Arrays.equals(this.asLines, other.getAsLines()))) &&
            ((this.asString==null && other.getAsString()==null) || 
             (this.asString!=null &&
              this.asString.equals(other.getAsString()))) &&
            ((this.building==null && other.getBuilding()==null) || 
             (this.building!=null &&
              this.building.equals(other.getBuilding()))) &&
            ((this.floor==null && other.getFloor()==null) || 
             (this.floor!=null &&
              this.floor.equals(other.getFloor()))) &&
            ((this.staircase==null && other.getStaircase()==null) || 
             (this.staircase!=null &&
              this.staircase.equals(other.getStaircase()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.streetNameAndNumber==null && other.getStreetNameAndNumber()==null) || 
             (this.streetNameAndNumber!=null &&
              this.streetNameAndNumber.equals(other.getStreetNameAndNumber()))) &&
            ((this.streetNumber==null && other.getStreetNumber()==null) || 
             (this.streetNumber!=null &&
              this.streetNumber.equals(other.getStreetNumber())));
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
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getApartment() != null) {
            _hashCode += getApartment().hashCode();
        }
        if (getAsLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsString() != null) {
            _hashCode += getAsString().hashCode();
        }
        if (getBuilding() != null) {
            _hashCode += getBuilding().hashCode();
        }
        if (getFloor() != null) {
            _hashCode += getFloor().hashCode();
        }
        if (getStaircase() != null) {
            _hashCode += getStaircase().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getStreetNameAndNumber() != null) {
            _hashCode += getStreetNameAndNumber().hashCode();
        }
        if (getStreetNumber() != null) {
            _hashCode += getStreetNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapStreetInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "soapStreetInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apartment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apartment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asLines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("building");
        elemField.setXmlName(new javax.xml.namespace.QName("", "building"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "floor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staircase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staircase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNameAndNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streetNameAndNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streetNumber"));
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
