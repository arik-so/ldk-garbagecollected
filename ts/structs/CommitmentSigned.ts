
            
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location



            export default class CommitmentSigned extends CommonBase {
                constructor(_dummy: object, ptr: number) {
                    super(ptr);
                }

                
                protected finalize() {
                    super.finalize();

                    if (this.ptr != 0) {
                        bindings.CommitmentSigned_free(this.ptr);
                    }
                }
	public Uint8Array get_channel_id() {
		Uint8Array ret = bindings.CommitmentSigned_get_channel_id(this.ptr);
		return ret;
	}

	public void set_channel_id(Uint8Array val) {
		bindings.CommitmentSigned_set_channel_id(this.ptr, InternalUtils.check_arr_len(val, 32));
	}

	public Uint8Array get_signature() {
		Uint8Array ret = bindings.CommitmentSigned_get_signature(this.ptr);
		return ret;
	}

	public void set_signature(Uint8Array val) {
		bindings.CommitmentSigned_set_signature(this.ptr, InternalUtils.check_arr_len(val, 64));
	}

	public void set_htlc_signatures(Uint8Array[] val) {
		bindings.CommitmentSigned_set_htlc_signatures(this.ptr, val != null ? Arrays.stream(val).map(val_conv_12 -> InternalUtils.check_arr_len(val_conv_12, 64)).toArray(Uint8Array[]::new) : null);
	}

	public static CommitmentSigned constructor_new(Uint8Array channel_id_arg, Uint8Array signature_arg, Uint8Array[] htlc_signatures_arg) {
		number ret = bindings.CommitmentSigned_new(InternalUtils.check_arr_len(channel_id_arg, 32), InternalUtils.check_arr_len(signature_arg, 64), htlc_signatures_arg != null ? Arrays.stream(htlc_signatures_arg).map(htlc_signatures_arg_conv_12 -> InternalUtils.check_arr_len(htlc_signatures_arg_conv_12, 64)).toArray(Uint8Array[]::new) : null);
		const ret_hu_conv: CommitmentSigned = new CommitmentSigned(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	public number clone_ptr() {
		number ret = bindings.CommitmentSigned_clone_ptr(this.ptr);
		return ret;
	}

	public CommitmentSigned clone() {
		number ret = bindings.CommitmentSigned_clone(this.ptr);
		const ret_hu_conv: CommitmentSigned = new CommitmentSigned(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public Uint8Array write() {
		Uint8Array ret = bindings.CommitmentSigned_write(this.ptr);
		return ret;
	}

	public static Result_CommitmentSignedDecodeErrorZ constructor_read(Uint8Array ser) {
		number ret = bindings.CommitmentSigned_read(ser);
		Result_CommitmentSignedDecodeErrorZ ret_hu_conv = Result_CommitmentSignedDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
