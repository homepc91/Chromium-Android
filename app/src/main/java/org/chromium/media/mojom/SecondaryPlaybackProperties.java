
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/watch_time_recorder.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class SecondaryPlaybackProperties extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int audioCodec;
    public int videoCodec;
    public String audioDecoderName;
    public String videoDecoderName;
    public org.chromium.gfx.mojom.Size naturalSize;

    private SecondaryPlaybackProperties(int version) {
        super(STRUCT_SIZE, version);
    }

    public SecondaryPlaybackProperties() {
        this(0);
    }

    public static SecondaryPlaybackProperties deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SecondaryPlaybackProperties deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SecondaryPlaybackProperties decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SecondaryPlaybackProperties result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SecondaryPlaybackProperties(elementsOrVersion);
                {
                    
                result.audioCodec = decoder0.readInt(8);
                    AudioCodec.validate(result.audioCodec);
                }
                {
                    
                result.videoCodec = decoder0.readInt(12);
                    VideoCodec.validate(result.videoCodec);
                }
                {
                    
                result.audioDecoderName = decoder0.readString(16, false);
                }
                {
                    
                result.videoDecoderName = decoder0.readString(24, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.naturalSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.audioCodec, 8);
        
        encoder0.encode(this.videoCodec, 12);
        
        encoder0.encode(this.audioDecoderName, 16, false);
        
        encoder0.encode(this.videoDecoderName, 24, false);
        
        encoder0.encode(this.naturalSize, 32, false);
    }
}