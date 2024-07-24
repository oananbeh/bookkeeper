// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DbLedgerStorageDataFormats.proto

package org.apache.bookkeeper.bookie.storage.ldb;

public final class DbLedgerStorageDataFormats {
  private DbLedgerStorageDataFormats() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LedgerDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LedgerData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bool exists = 1;</code>
     * @return Whether the exists field is set.
     */
    boolean hasExists();
    /**
     * <code>required bool exists = 1;</code>
     * @return The exists.
     */
    boolean getExists();

    /**
     * <code>required bool fenced = 2;</code>
     * @return Whether the fenced field is set.
     */
    boolean hasFenced();
    /**
     * <code>required bool fenced = 2;</code>
     * @return The fenced.
     */
    boolean getFenced();

    /**
     * <code>required bytes masterKey = 3;</code>
     * @return Whether the masterKey field is set.
     */
    boolean hasMasterKey();
    /**
     * <code>required bytes masterKey = 3;</code>
     * @return The masterKey.
     */
    com.google.protobuf.ByteString getMasterKey();

    /**
     * <code>optional bytes explicitLac = 4;</code>
     * @return Whether the explicitLac field is set.
     */
    boolean hasExplicitLac();
    /**
     * <code>optional bytes explicitLac = 4;</code>
     * @return The explicitLac.
     */
    com.google.protobuf.ByteString getExplicitLac();

    /**
     * <code>optional bool limbo = 5;</code>
     * @return Whether the limbo field is set.
     */
    boolean hasLimbo();
    /**
     * <code>optional bool limbo = 5;</code>
     * @return The limbo.
     */
    boolean getLimbo();
  }
  /**
   * <pre>
   **
   * Ledger metadata stored in the bookie
   * </pre>
   *
   * Protobuf type {@code LedgerData}
   */
  public static final class LedgerData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LedgerData)
      LedgerDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LedgerData.newBuilder() to construct.
    private LedgerData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LedgerData() {
      masterKey_ = com.google.protobuf.ByteString.EMPTY;
      explicitLac_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LedgerData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.internal_static_LedgerData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.internal_static_LedgerData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData.class, org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData.Builder.class);
    }

    private int bitField0_;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private boolean exists_ = false;
    /**
     * <code>required bool exists = 1;</code>
     * @return Whether the exists field is set.
     */
    @java.lang.Override
    public boolean hasExists() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bool exists = 1;</code>
     * @return The exists.
     */
    @java.lang.Override
    public boolean getExists() {
      return exists_;
    }

    public static final int FENCED_FIELD_NUMBER = 2;
    private boolean fenced_ = false;
    /**
     * <code>required bool fenced = 2;</code>
     * @return Whether the fenced field is set.
     */
    @java.lang.Override
    public boolean hasFenced() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required bool fenced = 2;</code>
     * @return The fenced.
     */
    @java.lang.Override
    public boolean getFenced() {
      return fenced_;
    }

    public static final int MASTERKEY_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString masterKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>required bytes masterKey = 3;</code>
     * @return Whether the masterKey field is set.
     */
    @java.lang.Override
    public boolean hasMasterKey() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required bytes masterKey = 3;</code>
     * @return The masterKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMasterKey() {
      return masterKey_;
    }

    public static final int EXPLICITLAC_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString explicitLac_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes explicitLac = 4;</code>
     * @return Whether the explicitLac field is set.
     */
    @java.lang.Override
    public boolean hasExplicitLac() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bytes explicitLac = 4;</code>
     * @return The explicitLac.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getExplicitLac() {
      return explicitLac_;
    }

    public static final int LIMBO_FIELD_NUMBER = 5;
    private boolean limbo_ = false;
    /**
     * <code>optional bool limbo = 5;</code>
     * @return Whether the limbo field is set.
     */
    @java.lang.Override
    public boolean hasLimbo() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional bool limbo = 5;</code>
     * @return The limbo.
     */
    @java.lang.Override
    public boolean getLimbo() {
      return limbo_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasExists()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFenced()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMasterKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBool(1, exists_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBool(2, fenced_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBytes(3, masterKey_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeBytes(4, explicitLac_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeBool(5, limbo_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, exists_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, fenced_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, masterKey_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, explicitLac_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, limbo_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData)) {
        return super.equals(obj);
      }
      org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData other = (org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData) obj;

      if (hasExists() != other.hasExists()) return false;
      if (hasExists()) {
        if (getExists()
            != other.getExists()) return false;
      }
      if (hasFenced() != other.hasFenced()) return false;
      if (hasFenced()) {
        if (getFenced()
            != other.getFenced()) return false;
      }
      if (hasMasterKey() != other.hasMasterKey()) return false;
      if (hasMasterKey()) {
        if (!getMasterKey()
            .equals(other.getMasterKey())) return false;
      }
      if (hasExplicitLac() != other.hasExplicitLac()) return false;
      if (hasExplicitLac()) {
        if (!getExplicitLac()
            .equals(other.getExplicitLac())) return false;
      }
      if (hasLimbo() != other.hasLimbo()) return false;
      if (hasLimbo()) {
        if (getLimbo()
            != other.getLimbo()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasExists()) {
        hash = (37 * hash) + EXISTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getExists());
      }
      if (hasFenced()) {
        hash = (37 * hash) + FENCED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getFenced());
      }
      if (hasMasterKey()) {
        hash = (37 * hash) + MASTERKEY_FIELD_NUMBER;
        hash = (53 * hash) + getMasterKey().hashCode();
      }
      if (hasExplicitLac()) {
        hash = (37 * hash) + EXPLICITLAC_FIELD_NUMBER;
        hash = (53 * hash) + getExplicitLac().hashCode();
      }
      if (hasLimbo()) {
        hash = (37 * hash) + LIMBO_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getLimbo());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     * Ledger metadata stored in the bookie
     * </pre>
     *
     * Protobuf type {@code LedgerData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LedgerData)
        org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.internal_static_LedgerData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.internal_static_LedgerData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData.class, org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData.Builder.class);
      }

      // Construct using org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        exists_ = false;
        fenced_ = false;
        masterKey_ = com.google.protobuf.ByteString.EMPTY;
        explicitLac_ = com.google.protobuf.ByteString.EMPTY;
        limbo_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.internal_static_LedgerData_descriptor;
      }

      @java.lang.Override
      public org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData getDefaultInstanceForType() {
        return org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData build() {
        org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData buildPartial() {
        org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData result = new org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.exists_ = exists_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fenced_ = fenced_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.masterKey_ = masterKey_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.explicitLac_ = explicitLac_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.limbo_ = limbo_;
          to_bitField0_ |= 0x00000010;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData) {
          return mergeFrom((org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData other) {
        if (other == org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData.getDefaultInstance()) return this;
        if (other.hasExists()) {
          setExists(other.getExists());
        }
        if (other.hasFenced()) {
          setFenced(other.getFenced());
        }
        if (other.hasMasterKey()) {
          setMasterKey(other.getMasterKey());
        }
        if (other.hasExplicitLac()) {
          setExplicitLac(other.getExplicitLac());
        }
        if (other.hasLimbo()) {
          setLimbo(other.getLimbo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasExists()) {
          return false;
        }
        if (!hasFenced()) {
          return false;
        }
        if (!hasMasterKey()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                exists_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                fenced_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                masterKey_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                explicitLac_ = input.readBytes();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 40: {
                limbo_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private boolean exists_ ;
      /**
       * <code>required bool exists = 1;</code>
       * @return Whether the exists field is set.
       */
      @java.lang.Override
      public boolean hasExists() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required bool exists = 1;</code>
       * @return The exists.
       */
      @java.lang.Override
      public boolean getExists() {
        return exists_;
      }
      /**
       * <code>required bool exists = 1;</code>
       * @param value The exists to set.
       * @return This builder for chaining.
       */
      public Builder setExists(boolean value) {

        exists_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required bool exists = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearExists() {
        bitField0_ = (bitField0_ & ~0x00000001);
        exists_ = false;
        onChanged();
        return this;
      }

      private boolean fenced_ ;
      /**
       * <code>required bool fenced = 2;</code>
       * @return Whether the fenced field is set.
       */
      @java.lang.Override
      public boolean hasFenced() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required bool fenced = 2;</code>
       * @return The fenced.
       */
      @java.lang.Override
      public boolean getFenced() {
        return fenced_;
      }
      /**
       * <code>required bool fenced = 2;</code>
       * @param value The fenced to set.
       * @return This builder for chaining.
       */
      public Builder setFenced(boolean value) {

        fenced_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required bool fenced = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFenced() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fenced_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString masterKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes masterKey = 3;</code>
       * @return Whether the masterKey field is set.
       */
      @java.lang.Override
      public boolean hasMasterKey() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required bytes masterKey = 3;</code>
       * @return The masterKey.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMasterKey() {
        return masterKey_;
      }
      /**
       * <code>required bytes masterKey = 3;</code>
       * @param value The masterKey to set.
       * @return This builder for chaining.
       */
      public Builder setMasterKey(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        masterKey_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes masterKey = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMasterKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        masterKey_ = getDefaultInstance().getMasterKey();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString explicitLac_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes explicitLac = 4;</code>
       * @return Whether the explicitLac field is set.
       */
      @java.lang.Override
      public boolean hasExplicitLac() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional bytes explicitLac = 4;</code>
       * @return The explicitLac.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getExplicitLac() {
        return explicitLac_;
      }
      /**
       * <code>optional bytes explicitLac = 4;</code>
       * @param value The explicitLac to set.
       * @return This builder for chaining.
       */
      public Builder setExplicitLac(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        explicitLac_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes explicitLac = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearExplicitLac() {
        bitField0_ = (bitField0_ & ~0x00000008);
        explicitLac_ = getDefaultInstance().getExplicitLac();
        onChanged();
        return this;
      }

      private boolean limbo_ ;
      /**
       * <code>optional bool limbo = 5;</code>
       * @return Whether the limbo field is set.
       */
      @java.lang.Override
      public boolean hasLimbo() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional bool limbo = 5;</code>
       * @return The limbo.
       */
      @java.lang.Override
      public boolean getLimbo() {
        return limbo_;
      }
      /**
       * <code>optional bool limbo = 5;</code>
       * @param value The limbo to set.
       * @return This builder for chaining.
       */
      public Builder setLimbo(boolean value) {

        limbo_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool limbo = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLimbo() {
        bitField0_ = (bitField0_ & ~0x00000010);
        limbo_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LedgerData)
    }

    // @@protoc_insertion_point(class_scope:LedgerData)
    private static final org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData();
    }

    public static org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LedgerData>
        PARSER = new com.google.protobuf.AbstractParser<LedgerData>() {
      @java.lang.Override
      public LedgerData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LedgerData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LedgerData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.bookkeeper.bookie.storage.ldb.DbLedgerStorageDataFormats.LedgerData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LedgerData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LedgerData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DbLedgerStorageDataFormats.proto\"c\n\nLe" +
      "dgerData\022\016\n\006exists\030\001 \002(\010\022\016\n\006fenced\030\002 \002(\010" +
      "\022\021\n\tmasterKey\030\003 \002(\014\022\023\n\013explicitLac\030\004 \001(\014" +
      "\022\r\n\005limbo\030\005 \001(\010B,\n(org.apache.bookkeeper" +
      ".bookie.storage.ldbH\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LedgerData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LedgerData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LedgerData_descriptor,
        new java.lang.String[] { "Exists", "Fenced", "MasterKey", "ExplicitLac", "Limbo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}