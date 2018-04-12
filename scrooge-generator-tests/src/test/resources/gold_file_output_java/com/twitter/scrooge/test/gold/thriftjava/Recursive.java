/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.scrooge.test.gold.thriftjava;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class Recursive implements TBase<Recursive, Recursive._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Recursive");

  private static final TField ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final TField REC_REQUEST_FIELD_DESC = new TField("recRequest", TType.STRUCT, (short)2);


  public long id;
  public Request recRequest;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ID((short)1, "id"),
    REC_REQUEST((short)2, "recRequest");
  
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
  
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // REC_REQUEST
          return REC_REQUEST;
        default:
          return null;
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
  
    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }
  
    private final short _thriftId;
    private final String _fieldName;
  
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
  
    public short getThriftFieldId() {
      return _thriftId;
    }
  
    public String getFieldName() {
      return _fieldName;
    }
  }


  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  
  /**
   * FieldValueMetaData.type returns TType.STRING for both string and binary field values.
   * This set can be used to determine if a FieldValueMetaData with type TType.STRING is actually
   * declared as binary in the idl file.
   */
  public static final Set<FieldValueMetaData> binaryFieldValueMetaDatas;
  
  private static FieldValueMetaData registerBinaryFieldValueMetaData(FieldValueMetaData f, Set<FieldValueMetaData> binaryFieldValues) {
    binaryFieldValues.add(f);
    return f;
  }
  
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    Set<FieldValueMetaData> tmpSet = new HashSet<FieldValueMetaData>();
    tmpMap.put(_Fields.ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.REC_REQUEST, new FieldMetaData("recRequest", TFieldRequirementType.OPTIONAL,
      new StructMetaData(TType.STRUCT, Request.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    binaryFieldValueMetaDatas = Collections.unmodifiableSet(tmpSet);
    FieldMetaData.addStructMetaDataMap(Recursive.class, metaDataMap);
  }

  /**
   * Returns a map of the annotations and their values for this struct declaration.
   * See fieldAnnotations or valueAnnotations for the annotations attached to struct fields
   * or enum values.
   */
  public static final Map<String, String> structAnnotations;
  static {
    structAnnotations = Collections.emptyMap();
  }

  /**
   * Returns a map of the annotations for each of this struct's fields, keyed by the field.
   * See structAnnotations for the annotations attached to this struct's declaration.
   */
  public static final Map<_Fields, Map<String, String>> fieldAnnotations;
  static {
    fieldAnnotations = Collections.emptyMap();
  }

  /**
   * Returns the set of fields that have a configured default value.
   * The default values for these fields can be obtained by
   * instantiating this class with the default constructor.
   */
  public static final Set<_Fields> hasDefaultValue;
  static {
    Set<_Fields> tmp = EnumSet.noneOf(_Fields.class);
    hasDefaultValue = Collections.unmodifiableSet(tmp);
  }


  public Recursive() {
  }

  public Recursive(
    long id)
  {
    this();
    this.id = id;
    setIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Recursive(Recursive other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.id = other.id;
    if (other.isSetRecRequest()) {
      this.recRequest = new Request(other.recRequest);
    }
  }

  public static List<String> validateNewInstance(Recursive item) {
    final List<String> buf = new ArrayList<String>();

    if (item.isSetRecRequest()) {
      Request _recRequest = item.recRequest;
      buf.addAll(com.twitter.scrooge.test.gold.thriftjava.Request.validateNewInstance(_recRequest));
    }

    return buf;
  }

  public Recursive deepCopy() {
    return new Recursive(this);
  }

  @java.lang.Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.recRequest = null;
  }

  public long getId() {
    return this.id;
  }

  public Recursive setId(long id) {
    this.id = id;
    setIdIsSet(true);

    return this;
  }

  public void unsetId() {
  __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public Request getRecRequest() {
    return this.recRequest;
  }

  public Recursive setRecRequest(Request recRequest) {
    this.recRequest = recRequest;
    
    return this;
  }

  public void unsetRecRequest() {
    this.recRequest = null;
  }

  /** Returns true if field recRequest is set (has been assigned a value) and false otherwise */
  public boolean isSetRecRequest() {
    return this.recRequest != null;
  }

  public void setRecRequestIsSet(boolean value) {
    if (!value) {
      this.recRequest = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;
    case REC_REQUEST:
      if (value == null) {
        unsetRecRequest();
      } else {
        setRecRequest((Request)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return new Long(getId());
    case REC_REQUEST:
      return getRecRequest();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case REC_REQUEST:
      return isSetRecRequest();
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Recursive)
      return this.equals((Recursive)that);
    return false;
  }

  public boolean equals(Recursive that) {
    if (that == null)
      return false;
    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }
    boolean this_present_recRequest = true && this.isSetRecRequest();
    boolean that_present_recRequest = true && that.isSetRecRequest();
    if (this_present_recRequest || that_present_recRequest) {
      if (!(this_present_recRequest && that_present_recRequest))
        return false;
      if (!this.recRequest.equals(that.recRequest))
        return false;
    }

    return true;
  }

  @java.lang.Override
  public int hashCode() {
    int hashCode = 1;
    {
      hashCode = 31 * hashCode + ((Long)id).hashCode();
    }
    if (isSetRecRequest()) {
      hashCode = 31 * hashCode + recRequest.hashCode();
    }
    return hashCode;
  }

  public int compareTo(Recursive other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Recursive typedOther = (Recursive)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecRequest()).compareTo(typedOther.isSetRecRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecRequest()) {
      lastComparison = TBaseHelper.compareTo(this.recRequest, typedOther.recRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // ID
          if (field.type == TType.I64) {
            this.id = iprot.readI64();
            setIdIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REC_REQUEST
          if (field.type == TType.STRUCT) {
            this.recRequest = new Request();
            this.recRequest.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI64(this.id);
    oprot.writeFieldEnd();
    if (this.recRequest != null) {
      if (isSetRecRequest()) {
        oprot.writeFieldBegin(REC_REQUEST_FIELD_DESC);
        this.recRequest.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Recursive(");
    boolean first = true;
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (isSetRecRequest()) {
      if (!first) sb.append(", ");
      sb.append("recRequest:");
      if (this.recRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.recRequest);
      }
      first = false;
      }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}

