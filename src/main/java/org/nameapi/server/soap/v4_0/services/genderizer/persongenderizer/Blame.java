/**
 * Blame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class Blame implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Blame(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CLIENT = "CLIENT";
    public static final java.lang.String _SERVER = "SERVER";
    public static final java.lang.String _NETWORK = "NETWORK";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final Blame CLIENT = new Blame(_CLIENT);
    public static final Blame SERVER = new Blame(_SERVER);
    public static final Blame NETWORK = new Blame(_NETWORK);
    public static final Blame UNKNOWN = new Blame(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static Blame fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Blame enumeration = (Blame)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Blame fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Blame.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "blame"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
