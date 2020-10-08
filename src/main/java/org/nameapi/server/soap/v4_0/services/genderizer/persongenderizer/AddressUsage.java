/**
 * AddressUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class AddressUsage implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AddressUsage(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DOMICILE = "DOMICILE";
    public static final java.lang.String _CORRESPONDENCE = "CORRESPONDENCE";
    public static final java.lang.String _INVOICE = "INVOICE";
    public static final java.lang.String _DELIVERY = "DELIVERY";
    public static final java.lang.String _OTHER = "OTHER";
    public static final AddressUsage DOMICILE = new AddressUsage(_DOMICILE);
    public static final AddressUsage CORRESPONDENCE = new AddressUsage(_CORRESPONDENCE);
    public static final AddressUsage INVOICE = new AddressUsage(_INVOICE);
    public static final AddressUsage DELIVERY = new AddressUsage(_DELIVERY);
    public static final AddressUsage OTHER = new AddressUsage(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static AddressUsage fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AddressUsage enumeration = (AddressUsage)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AddressUsage fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressUsage.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "addressUsage"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
