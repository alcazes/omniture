/**
 * Event_type_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Event_type_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Event_type_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "0";
    public static final java.lang.String _value2 = "1";
    public static final java.lang.String _value3 = "3";
    public static final java.lang.String _value4 = "5";
    public static final java.lang.String _value5 = "7";
    public static final java.lang.String _value6 = "d";
    public static final java.lang.String _value7 = "f";
    public static final Event_type_enum value1 = new Event_type_enum(_value1);
    public static final Event_type_enum value2 = new Event_type_enum(_value2);
    public static final Event_type_enum value3 = new Event_type_enum(_value3);
    public static final Event_type_enum value4 = new Event_type_enum(_value4);
    public static final Event_type_enum value5 = new Event_type_enum(_value5);
    public static final Event_type_enum value6 = new Event_type_enum(_value6);
    public static final Event_type_enum value7 = new Event_type_enum(_value7);
    public java.lang.String getValue() { return _value_;}
    public static Event_type_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Event_type_enum enumeration = (Event_type_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Event_type_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Event_type_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "event_type_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
