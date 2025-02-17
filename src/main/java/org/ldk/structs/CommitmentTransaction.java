package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * This class tracks the per-transaction information needed to build a commitment transaction and to
 * actually build it and sign.  It is used for holder transactions that we sign only when needed
 * and for transactions we sign for the counterparty.
 * 
 * This class can be used inside a signer implementation to generate a signature given the relevant
 * secret key.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class CommitmentTransaction extends CommonBase {
	CommitmentTransaction(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.CommitmentTransaction_free(ptr); }
	}

	/**
	 * Creates a copy of the CommitmentTransaction
	 */
	public CommitmentTransaction clone() {
		long ret = bindings.CommitmentTransaction_clone(this.ptr);
		CommitmentTransaction ret_hu_conv = new CommitmentTransaction(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Serialize the CommitmentTransaction object into a byte array which can be read by CommitmentTransaction_read
	 */
	public byte[] write() {
		byte[] ret = bindings.CommitmentTransaction_write(this.ptr);
		return ret;
	}

	/**
	 * Read a CommitmentTransaction from a byte array, created by CommitmentTransaction_write
	 */
	public static Result_CommitmentTransactionDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.CommitmentTransaction_read(ser);
		Result_CommitmentTransactionDecodeErrorZ ret_hu_conv = Result_CommitmentTransactionDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * The backwards-counting commitment number
	 */
	public long commitment_number() {
		long ret = bindings.CommitmentTransaction_commitment_number(this.ptr);
		return ret;
	}

	/**
	 * The value to be sent to the broadcaster
	 */
	public long to_broadcaster_value_sat() {
		long ret = bindings.CommitmentTransaction_to_broadcaster_value_sat(this.ptr);
		return ret;
	}

	/**
	 * The value to be sent to the counterparty
	 */
	public long to_countersignatory_value_sat() {
		long ret = bindings.CommitmentTransaction_to_countersignatory_value_sat(this.ptr);
		return ret;
	}

	/**
	 * The feerate paid per 1000-weight-unit in this commitment transaction.
	 */
	public int feerate_per_kw() {
		int ret = bindings.CommitmentTransaction_feerate_per_kw(this.ptr);
		return ret;
	}

	/**
	 * Trust our pre-built transaction and derived transaction creation public keys.
	 * 
	 * Applies a wrapper which allows access to these fields.
	 * 
	 * This should only be used if you fully trust the builder of this object.  It should not
	 * \tbe used by an external signer - instead use the verify function.
	 */
	public TrustedCommitmentTransaction trust() {
		long ret = bindings.CommitmentTransaction_trust(this.ptr);
		TrustedCommitmentTransaction ret_hu_conv = new TrustedCommitmentTransaction(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Verify our pre-built transaction and derived transaction creation public keys.
	 * 
	 * Applies a wrapper which allows access to these fields.
	 * 
	 * An external validating signer must call this method before signing
	 * or using the built transaction.
	 */
	public Result_TrustedCommitmentTransactionNoneZ verify(DirectedChannelTransactionParameters channel_parameters, ChannelPublicKeys broadcaster_keys, ChannelPublicKeys countersignatory_keys) {
		long ret = bindings.CommitmentTransaction_verify(this.ptr, channel_parameters == null ? 0 : channel_parameters.ptr & ~1, broadcaster_keys == null ? 0 : broadcaster_keys.ptr & ~1, countersignatory_keys == null ? 0 : countersignatory_keys.ptr & ~1);
		Result_TrustedCommitmentTransactionNoneZ ret_hu_conv = Result_TrustedCommitmentTransactionNoneZ.constr_from_ptr(ret);
		this.ptrs_to.add(channel_parameters);
		this.ptrs_to.add(broadcaster_keys);
		this.ptrs_to.add(countersignatory_keys);
		return ret_hu_conv;
	}

}
