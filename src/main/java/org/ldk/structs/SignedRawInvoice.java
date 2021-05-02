package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * Represents a signed `RawInvoice` with cached hash. The signature is not checked and may be
 * invalid.
 * 
 * # Invariants
 * The hash has to be either from the deserialized invoice or from the serialized `raw_invoice`.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class SignedRawInvoice extends CommonBase {
	SignedRawInvoice(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.SignedRawInvoice_free(ptr); }
	}

	/**
	 * Creates a copy of the SignedRawInvoice
	 */
	public SignedRawInvoice clone() {
		long ret = bindings.SignedRawInvoice_clone(this.ptr);
		SignedRawInvoice ret_hu_conv = new SignedRawInvoice(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Disassembles the `SignedRawInvoice` into its three parts:
	 * 1. raw invoice
	 * 2. hash of the raw invoice
	 * 3. signature
	 */
	public ThreeTuple<RawInvoice, byte[], InvoiceSignature> into_parts() {
		long ret = bindings.SignedRawInvoice_into_parts(this.ptr);
		long ret_a = bindings.LDKC3Tuple_RawInvoice_u832InvoiceSignatureZ_get_a(ret);
		RawInvoice ret_a_hu_conv = new RawInvoice(null, ret_a);
		ret_a_hu_conv.ptrs_to.add(this);;
		byte[] ret_b = bindings.LDKC3Tuple_RawInvoice_u832InvoiceSignatureZ_get_b(ret);
		long ret_c = bindings.LDKC3Tuple_RawInvoice_u832InvoiceSignatureZ_get_c(ret);
		InvoiceSignature ret_c_hu_conv = new InvoiceSignature(null, ret_c);
		ret_c_hu_conv.ptrs_to.add(this);;
		ThreeTuple<RawInvoice, byte[], InvoiceSignature> ret_conv = new ThreeTuple<RawInvoice, byte[], InvoiceSignature>(ret_a_hu_conv, ret_b, ret_c_hu_conv, () -> {
			bindings.C3Tuple_RawInvoice_u832InvoiceSignatureZ_free(ret);
		});
		ret_a_hu_conv.ptrs_to.add(ret_conv);
		ret_c_hu_conv.ptrs_to.add(ret_conv);
		return ret_conv;
	}

	/**
	 * The `RawInvoice` which was signed.
	 */
	public RawInvoice raw_invoice() {
		long ret = bindings.SignedRawInvoice_raw_invoice(this.ptr);
		RawInvoice ret_hu_conv = new RawInvoice(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * The hash of the `RawInvoice` that was signed.
	 */
	public byte[] hash() {
		byte[] ret = bindings.SignedRawInvoice_hash(this.ptr);
		return ret;
	}

	/**
	 * InvoiceSignature for the invoice.
	 */
	public InvoiceSignature signature() {
		long ret = bindings.SignedRawInvoice_signature(this.ptr);
		InvoiceSignature ret_hu_conv = new InvoiceSignature(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Recovers the public key used for signing the invoice from the recoverable signature.
	 */
	public Result_PayeePubKeyErrorZ recover_payee_pub_key() {
		long ret = bindings.SignedRawInvoice_recover_payee_pub_key(this.ptr);
		Result_PayeePubKeyErrorZ ret_hu_conv = Result_PayeePubKeyErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Checks if the signature is valid for the included payee public key or if none exists if it's
	 * valid for the recovered signature (which should always be true?).
	 */
	public boolean check_signature() {
		boolean ret = bindings.SignedRawInvoice_check_signature(this.ptr);
		return ret;
	}

	/**
	 * Read a SignedRawInvoice object from a string
	 */
	public static Result_SignedRawInvoiceNoneZ constructor_from_str(String s) {
		long ret = bindings.SignedRawInvoice_from_str(s);
		Result_SignedRawInvoiceNoneZ ret_hu_conv = Result_SignedRawInvoiceNoneZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Get the string representation of a SignedRawInvoice object
	 */
	public String to_str() {
		String ret = bindings.SignedRawInvoice_to_str(this.ptr);
		return ret;
	}

}
