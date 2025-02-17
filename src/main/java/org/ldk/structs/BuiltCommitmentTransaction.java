package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * A pre-built Bitcoin commitment transaction and its txid.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class BuiltCommitmentTransaction extends CommonBase {
	BuiltCommitmentTransaction(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.BuiltCommitmentTransaction_free(ptr); }
	}

	/**
	 * The commitment transaction
	 */
	public byte[] get_transaction() {
		byte[] ret = bindings.BuiltCommitmentTransaction_get_transaction(this.ptr);
		return ret;
	}

	/**
	 * The commitment transaction
	 */
	public void set_transaction(byte[] val) {
		bindings.BuiltCommitmentTransaction_set_transaction(this.ptr, val);
	}

	/**
	 * The txid for the commitment transaction.
	 * 
	 * This is provided as a performance optimization, instead of calling transaction.txid()
	 * multiple times.
	 */
	public byte[] get_txid() {
		byte[] ret = bindings.BuiltCommitmentTransaction_get_txid(this.ptr);
		return ret;
	}

	/**
	 * The txid for the commitment transaction.
	 * 
	 * This is provided as a performance optimization, instead of calling transaction.txid()
	 * multiple times.
	 */
	public void set_txid(byte[] val) {
		bindings.BuiltCommitmentTransaction_set_txid(this.ptr, val);
	}

	/**
	 * Constructs a new BuiltCommitmentTransaction given each field
	 */
	public static BuiltCommitmentTransaction constructor_new(byte[] transaction_arg, byte[] txid_arg) {
		long ret = bindings.BuiltCommitmentTransaction_new(transaction_arg, txid_arg);
		BuiltCommitmentTransaction ret_hu_conv = new BuiltCommitmentTransaction(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the BuiltCommitmentTransaction
	 */
	public BuiltCommitmentTransaction clone() {
		long ret = bindings.BuiltCommitmentTransaction_clone(this.ptr);
		BuiltCommitmentTransaction ret_hu_conv = new BuiltCommitmentTransaction(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Serialize the BuiltCommitmentTransaction object into a byte array which can be read by BuiltCommitmentTransaction_read
	 */
	public byte[] write() {
		byte[] ret = bindings.BuiltCommitmentTransaction_write(this.ptr);
		return ret;
	}

	/**
	 * Read a BuiltCommitmentTransaction from a byte array, created by BuiltCommitmentTransaction_write
	 */
	public static Result_BuiltCommitmentTransactionDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.BuiltCommitmentTransaction_read(ser);
		Result_BuiltCommitmentTransactionDecodeErrorZ ret_hu_conv = Result_BuiltCommitmentTransactionDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Get the SIGHASH_ALL sighash value of the transaction.
	 * 
	 * This can be used to verify a signature.
	 */
	public byte[] get_sighash_all(byte[] funding_redeemscript, long channel_value_satoshis) {
		byte[] ret = bindings.BuiltCommitmentTransaction_get_sighash_all(this.ptr, funding_redeemscript, channel_value_satoshis);
		return ret;
	}

	/**
	 * Sign a transaction, either because we are counter-signing the counterparty's transaction or
	 * because we are about to broadcast a holder transaction.
	 */
	public byte[] sign(byte[] funding_key, byte[] funding_redeemscript, long channel_value_satoshis) {
		byte[] ret = bindings.BuiltCommitmentTransaction_sign(this.ptr, funding_key, funding_redeemscript, channel_value_satoshis);
		return ret;
	}

}
