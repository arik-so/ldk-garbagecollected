package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * Information about a spendable output to a P2WSH script. See
 * SpendableOutputDescriptor::DelayedPaymentOutput for more details on how to spend this.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class DelayedPaymentOutputDescriptor extends CommonBase {
	DelayedPaymentOutputDescriptor(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.DelayedPaymentOutputDescriptor_free(ptr); }
	}

	/**
	 * The outpoint which is spendable
	 */
	public OutPoint get_outpoint() {
		long ret = bindings.DelayedPaymentOutputDescriptor_get_outpoint(this.ptr);
		OutPoint ret_hu_conv = new OutPoint(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * The outpoint which is spendable
	 */
	public void set_outpoint(OutPoint val) {
		bindings.DelayedPaymentOutputDescriptor_set_outpoint(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	/**
	 * Per commitment point to derive delayed_payment_key by key holder
	 */
	public byte[] get_per_commitment_point() {
		byte[] ret = bindings.DelayedPaymentOutputDescriptor_get_per_commitment_point(this.ptr);
		return ret;
	}

	/**
	 * Per commitment point to derive delayed_payment_key by key holder
	 */
	public void set_per_commitment_point(byte[] val) {
		bindings.DelayedPaymentOutputDescriptor_set_per_commitment_point(this.ptr, val);
	}

	/**
	 * The nSequence value which must be set in the spending input to satisfy the OP_CSV in
	 * the witness_script.
	 */
	public short get_to_self_delay() {
		short ret = bindings.DelayedPaymentOutputDescriptor_get_to_self_delay(this.ptr);
		return ret;
	}

	/**
	 * The nSequence value which must be set in the spending input to satisfy the OP_CSV in
	 * the witness_script.
	 */
	public void set_to_self_delay(short val) {
		bindings.DelayedPaymentOutputDescriptor_set_to_self_delay(this.ptr, val);
	}

	/**
	 * The output which is referenced by the given outpoint
	 */
	public void set_output(TxOut val) {
		bindings.DelayedPaymentOutputDescriptor_set_output(this.ptr, val.ptr);
	}

	/**
	 * The revocation point specific to the commitment transaction which was broadcast. Used to
	 * derive the witnessScript for this output.
	 */
	public byte[] get_revocation_pubkey() {
		byte[] ret = bindings.DelayedPaymentOutputDescriptor_get_revocation_pubkey(this.ptr);
		return ret;
	}

	/**
	 * The revocation point specific to the commitment transaction which was broadcast. Used to
	 * derive the witnessScript for this output.
	 */
	public void set_revocation_pubkey(byte[] val) {
		bindings.DelayedPaymentOutputDescriptor_set_revocation_pubkey(this.ptr, val);
	}

	/**
	 * Arbitrary identification information returned by a call to
	 * `Sign::channel_keys_id()`. This may be useful in re-deriving keys used in
	 * the channel to spend the output.
	 */
	public byte[] get_channel_keys_id() {
		byte[] ret = bindings.DelayedPaymentOutputDescriptor_get_channel_keys_id(this.ptr);
		return ret;
	}

	/**
	 * Arbitrary identification information returned by a call to
	 * `Sign::channel_keys_id()`. This may be useful in re-deriving keys used in
	 * the channel to spend the output.
	 */
	public void set_channel_keys_id(byte[] val) {
		bindings.DelayedPaymentOutputDescriptor_set_channel_keys_id(this.ptr, val);
	}

	/**
	 * The value of the channel which this output originated from, possibly indirectly.
	 */
	public long get_channel_value_satoshis() {
		long ret = bindings.DelayedPaymentOutputDescriptor_get_channel_value_satoshis(this.ptr);
		return ret;
	}

	/**
	 * The value of the channel which this output originated from, possibly indirectly.
	 */
	public void set_channel_value_satoshis(long val) {
		bindings.DelayedPaymentOutputDescriptor_set_channel_value_satoshis(this.ptr, val);
	}

	/**
	 * Constructs a new DelayedPaymentOutputDescriptor given each field
	 */
	public static DelayedPaymentOutputDescriptor constructor_new(OutPoint outpoint_arg, byte[] per_commitment_point_arg, short to_self_delay_arg, TxOut output_arg, byte[] revocation_pubkey_arg, byte[] channel_keys_id_arg, long channel_value_satoshis_arg) {
		long ret = bindings.DelayedPaymentOutputDescriptor_new(outpoint_arg == null ? 0 : outpoint_arg.ptr & ~1, per_commitment_point_arg, to_self_delay_arg, output_arg.ptr, revocation_pubkey_arg, channel_keys_id_arg, channel_value_satoshis_arg);
		DelayedPaymentOutputDescriptor ret_hu_conv = new DelayedPaymentOutputDescriptor(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		ret_hu_conv.ptrs_to.add(outpoint_arg);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the DelayedPaymentOutputDescriptor
	 */
	public DelayedPaymentOutputDescriptor clone() {
		long ret = bindings.DelayedPaymentOutputDescriptor_clone(this.ptr);
		DelayedPaymentOutputDescriptor ret_hu_conv = new DelayedPaymentOutputDescriptor(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

}
