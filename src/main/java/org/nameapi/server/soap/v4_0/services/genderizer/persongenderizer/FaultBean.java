/**
 * FaultBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class FaultBean  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Blame blame;

    private int errorCode;

    private java.lang.String faultCause;

    private java.lang.String message1;

    private boolean problemReported;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Retry retryOtherServers;

    private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Retry retrySameServer;

    public FaultBean() {
    }

    public FaultBean(
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Blame blame,
           int errorCode,
           java.lang.String faultCause,
           java.lang.String message1,
           boolean problemReported,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Retry retryOtherServers,
           org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Retry retrySameServer) {
        this.blame = blame;
        this.errorCode = errorCode;
        this.faultCause = faultCause;
        this.message1 = message1;
        this.problemReported = problemReported;
        this.retryOtherServers = retryOtherServers;
        this.retrySameServer = retrySameServer;
    }


    /**
     * Gets the blame value for this FaultBean.
     * 
     * @return blame
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Blame getBlame() {
        return blame;
    }


    /**
     * Sets the blame value for this FaultBean.
     * 
     * @param blame
     */
    public void setBlame(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Blame blame) {
        this.blame = blame;
    }


    /**
     * Gets the errorCode value for this FaultBean.
     * 
     * @return errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this FaultBean.
     * 
     * @param errorCode
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the faultCause value for this FaultBean.
     * 
     * @return faultCause
     */
    public java.lang.String getFaultCause() {
        return faultCause;
    }


    /**
     * Sets the faultCause value for this FaultBean.
     * 
     * @param faultCause
     */
    public void setFaultCause(java.lang.String faultCause) {
        this.faultCause = faultCause;
    }


    /**
     * Gets the message1 value for this FaultBean.
     * 
     * @return message1
     */
    public java.lang.String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this FaultBean.
     * 
     * @param message1
     */
    public void setMessage1(java.lang.String message1) {
        this.message1 = message1;
    }


    /**
     * Gets the problemReported value for this FaultBean.
     * 
     * @return problemReported
     */
    public boolean isProblemReported() {
        return problemReported;
    }


    /**
     * Sets the problemReported value for this FaultBean.
     * 
     * @param problemReported
     */
    public void setProblemReported(boolean problemReported) {
        this.problemReported = problemReported;
    }


    /**
     * Gets the retryOtherServers value for this FaultBean.
     * 
     * @return retryOtherServers
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Retry getRetryOtherServers() {
        return retryOtherServers;
    }


    /**
     * Sets the retryOtherServers value for this FaultBean.
     * 
     * @param retryOtherServers
     */
    public void setRetryOtherServers(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Retry retryOtherServers) {
        this.retryOtherServers = retryOtherServers;
    }


    /**
     * Gets the retrySameServer value for this FaultBean.
     * 
     * @return retrySameServer
     */
    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Retry getRetrySameServer() {
        return retrySameServer;
    }


    /**
     * Sets the retrySameServer value for this FaultBean.
     * 
     * @param retrySameServer
     */
    public void setRetrySameServer(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.Retry retrySameServer) {
        this.retrySameServer = retrySameServer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultBean)) return false;
        FaultBean other = (FaultBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blame==null && other.getBlame()==null) || 
             (this.blame!=null &&
              this.blame.equals(other.getBlame()))) &&
            this.errorCode == other.getErrorCode() &&
            ((this.faultCause==null && other.getFaultCause()==null) || 
             (this.faultCause!=null &&
              this.faultCause.equals(other.getFaultCause()))) &&
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1()))) &&
            this.problemReported == other.isProblemReported() &&
            ((this.retryOtherServers==null && other.getRetryOtherServers()==null) || 
             (this.retryOtherServers!=null &&
              this.retryOtherServers.equals(other.getRetryOtherServers()))) &&
            ((this.retrySameServer==null && other.getRetrySameServer()==null) || 
             (this.retrySameServer!=null &&
              this.retrySameServer.equals(other.getRetrySameServer())));
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
        if (getBlame() != null) {
            _hashCode += getBlame().hashCode();
        }
        _hashCode += getErrorCode();
        if (getFaultCause() != null) {
            _hashCode += getFaultCause().hashCode();
        }
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        _hashCode += (isProblemReported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRetryOtherServers() != null) {
            _hashCode += getRetryOtherServers().hashCode();
        }
        if (getRetrySameServer() != null) {
            _hashCode += getRetrySameServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "faultBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blame");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "blame"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemReported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "problemReported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryOtherServers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retryOtherServers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "retry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrySameServer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrySameServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "retry"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
