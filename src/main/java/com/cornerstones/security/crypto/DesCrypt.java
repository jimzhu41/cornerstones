/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package com.cornerstones.security.crypto;

import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.DESedeKeySpec;


/**
 * Utility class for doing DESded (3DES) Two-Way Encryption
 *
 */
public class DesCrypt {

    public static final String module = DesCrypt.class.getName();

    public static Key generateKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("DESede");

        // generate the DES3 key
        return keyGen.generateKey();
    }

    public static byte[] encrypt(Key key, byte[] bytes) throws Exception {
        Cipher cipher = DesCrypt.getCipher(key, Cipher.ENCRYPT_MODE);
        byte[] encBytes = null;
        try {
            encBytes = cipher.doFinal(bytes);
        } catch (IllegalStateException e) {
            throw new Exception(e);
        } catch (IllegalBlockSizeException e) {
            throw new Exception(e);
        } catch (BadPaddingException e) {
            throw new Exception(e);
        }
        return encBytes;
    }

    public static byte[] decrypt(Key key, byte[] bytes) throws Exception {
        Cipher cipher = DesCrypt.getCipher(key, Cipher.DECRYPT_MODE);
        byte[] decBytes = null;
        try {
            decBytes = cipher.doFinal(bytes);
        } catch (IllegalStateException e) {
            throw new Exception(e);
        } catch (IllegalBlockSizeException e) {
            throw new Exception(e);
        } catch (BadPaddingException e) {
            throw new Exception(e);
        }
        return decBytes;
    }

    public static Key getDesKey(byte[] rawKey) throws Exception {
        SecretKeyFactory skf = null;
        try {
            skf = SecretKeyFactory.getInstance("DESede");
        } catch (NoSuchAlgorithmException e) {
            throw new Exception(e);
        }

        // load the raw key
        if (rawKey.length > 0) {
            DESedeKeySpec desedeSpec1 = null;
            try {
                desedeSpec1 = new DESedeKeySpec(rawKey);
            } catch (InvalidKeyException e) {
                throw new Exception(e);
            }

            // create the SecretKey Object
            Key key = null;
            try {
                key = skf.generateSecret(desedeSpec1);
            } catch (InvalidKeySpecException e) {
                throw new Exception(e);
            }
            return key;
        } else {
            throw new Exception("Not a valid DESede key!");
        }
    }

    // return a cipher for a key - DESede/CBC/PKCS5Padding IV = 0
    protected static Cipher getCipher(Key key, int mode) throws Exception {
        byte[] zeros = { 0, 0, 0, 0, 0, 0, 0, 0 };
        IvParameterSpec iv = new IvParameterSpec(zeros);

        // create the Cipher - DESede/CBC/NoPadding
        Cipher encCipher = null;
        try {
            encCipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        } catch (NoSuchAlgorithmException e) {
            throw new Exception(e);
        } catch (NoSuchPaddingException e) {
            throw new Exception(e);
        }
        try {
            encCipher.init(mode, key, iv);
        } catch (InvalidKeyException e) {
            throw new Exception(e);
        } catch (InvalidAlgorithmParameterException e) {
            throw new Exception(e);
        }
        return encCipher;
    }
}
