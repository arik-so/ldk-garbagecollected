
            
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location



            export class Sign extends CommonBase {

                bindings_instance?: bindings.LDKSign;

                constructor(ptr?: number, arg?: bindings.LDKSign, pubkeys?: ChannelPublicKeys) {
                    if (Number.isFinite(ptr)) {
				        super(ptr);
				        this.bindings_instance = null;
				    } else {
				        // TODO: private constructor instantiation
				        super(bindings.LDKSign_new(arg, pubkeys == null ? 0 : pubkeys.ptr & ~1));
				        this.ptrs_to.push(arg);
				        this.ptrs_to.add(pubkeys);

				    }
                }

                protected finalize() {
                    if (this.ptr != 0) {
                        bindings.Sign_free(this.ptr);
                    }
                    super.finalize();
                }

                static new_impl(arg: SignInterface, pubkeys: ChannelPublicKeys): Sign {
                    const impl_holder: LDKSignHolder = new LDKSignHolder();
                    let structImplementation = <bindings.LDKSign>{
                        // todo: in-line interface filling
                        get_per_commitment_point (idx: number): Uint8Array {
							Uint8Array ret = arg.get_per_commitment_point(idx);
				return ret;
						},

						release_commitment_secret (idx: number): Uint8Array {
							Uint8Array ret = arg.release_commitment_secret(idx);
				return ret;
						},

						channel_keys_id (): Uint8Array {
							Uint8Array ret = arg.channel_keys_id();
				return ret;
						},

						sign_counterparty_commitment (commitment_tx: number): number {
							const commitment_tx_hu_conv: CommitmentTransaction = new CommitmentTransaction(null, commitment_tx);
							Result_C2Tuple_SignatureCVec_SignatureZZNoneZ ret = arg.sign_counterparty_commitment(commitment_tx_hu_conv);
				result: number = ret != null ? ret.ptr : 0;
				return result;
						},

						sign_holder_commitment_and_htlcs (commitment_tx: number): number {
							const commitment_tx_hu_conv: HolderCommitmentTransaction = new HolderCommitmentTransaction(null, commitment_tx);
							Result_C2Tuple_SignatureCVec_SignatureZZNoneZ ret = arg.sign_holder_commitment_and_htlcs(commitment_tx_hu_conv);
				result: number = ret != null ? ret.ptr : 0;
				return result;
						},

						sign_justice_transaction (justice_tx: Uint8Array, input: number, amount: number, per_commitment_key: Uint8Array, htlc: number): number {
							const htlc_hu_conv: HTLCOutputInCommitment = new HTLCOutputInCommitment(null, htlc);
							Result_SignatureNoneZ ret = arg.sign_justice_transaction(justice_tx, input, amount, per_commitment_key, htlc_hu_conv);
				result: number = ret != null ? ret.ptr : 0;
				return result;
						},

						sign_counterparty_htlc_transaction (htlc_tx: Uint8Array, input: number, amount: number, per_commitment_point: Uint8Array, htlc: number): number {
							const htlc_hu_conv: HTLCOutputInCommitment = new HTLCOutputInCommitment(null, htlc);
							Result_SignatureNoneZ ret = arg.sign_counterparty_htlc_transaction(htlc_tx, input, amount, per_commitment_point, htlc_hu_conv);
				result: number = ret != null ? ret.ptr : 0;
				return result;
						},

						sign_closing_transaction (closing_tx: Uint8Array): number {
							Result_SignatureNoneZ ret = arg.sign_closing_transaction(closing_tx);
				result: number = ret != null ? ret.ptr : 0;
				return result;
						},

						sign_channel_announcement (msg: number): number {
							const msg_hu_conv: UnsignedChannelAnnouncement = new UnsignedChannelAnnouncement(null, msg);
							Result_SignatureNoneZ ret = arg.sign_channel_announcement(msg_hu_conv);
				result: number = ret != null ? ret.ptr : 0;
				return result;
						},

						ready_channel (channel_parameters: number): void {
							const channel_parameters_hu_conv: ChannelTransactionParameters = new ChannelTransactionParameters(null, channel_parameters);
							arg.ready_channel(channel_parameters_hu_conv);
						},

						write (): Uint8Array {
							Uint8Array ret = arg.write();
				return ret;
						},

						
                    };
                    impl_holder.held = new Sign (null, structImplementation, pubkeys);
                }
            }

            export interface SignInterface {
                get_per_commitment_point(idx: number): Uint8Array;
				release_commitment_secret(idx: number): Uint8Array;
				channel_keys_id(): Uint8Array;
				sign_counterparty_commitment(commitment_tx: CommitmentTransaction): Result_C2Tuple_SignatureCVec_SignatureZZNoneZ;
				sign_holder_commitment_and_htlcs(commitment_tx: HolderCommitmentTransaction): Result_C2Tuple_SignatureCVec_SignatureZZNoneZ;
				sign_justice_transaction(justice_tx: Uint8Array, input: number, amount: number, per_commitment_key: Uint8Array, htlc: HTLCOutputInCommitment): Result_SignatureNoneZ;
				sign_counterparty_htlc_transaction(htlc_tx: Uint8Array, input: number, amount: number, per_commitment_point: Uint8Array, htlc: HTLCOutputInCommitment): Result_SignatureNoneZ;
				sign_closing_transaction(closing_tx: Uint8Array): Result_SignatureNoneZ;
				sign_channel_announcement(msg: UnsignedChannelAnnouncement): Result_SignatureNoneZ;
				ready_channel(channel_parameters: ChannelTransactionParameters): void;
				write(): Uint8Array;
				
            }

            class LDKSignHolder {
                held: Sign;
            }
	public Uint8Array get_per_commitment_point(number idx) {
		Uint8Array ret = bindings.Sign_get_per_commitment_point(this.ptr, idx);
		return ret;
	}

	public Uint8Array release_commitment_secret(number idx) {
		Uint8Array ret = bindings.Sign_release_commitment_secret(this.ptr, idx);
		return ret;
	}

	public Uint8Array channel_keys_id() {
		Uint8Array ret = bindings.Sign_channel_keys_id(this.ptr);
		return ret;
	}

	public Result_C2Tuple_SignatureCVec_SignatureZZNoneZ sign_counterparty_commitment(CommitmentTransaction commitment_tx) {
		number ret = bindings.Sign_sign_counterparty_commitment(this.ptr, commitment_tx == null ? 0 : commitment_tx.ptr & ~1);
		Result_C2Tuple_SignatureCVec_SignatureZZNoneZ ret_hu_conv = Result_C2Tuple_SignatureCVec_SignatureZZNoneZ.constr_from_ptr(ret);
		this.ptrs_to.add(commitment_tx);
		return ret_hu_conv;
	}

	public Result_C2Tuple_SignatureCVec_SignatureZZNoneZ sign_holder_commitment_and_htlcs(HolderCommitmentTransaction commitment_tx) {
		number ret = bindings.Sign_sign_holder_commitment_and_htlcs(this.ptr, commitment_tx == null ? 0 : commitment_tx.ptr & ~1);
		Result_C2Tuple_SignatureCVec_SignatureZZNoneZ ret_hu_conv = Result_C2Tuple_SignatureCVec_SignatureZZNoneZ.constr_from_ptr(ret);
		this.ptrs_to.add(commitment_tx);
		return ret_hu_conv;
	}

	public Result_SignatureNoneZ sign_justice_transaction(Uint8Array justice_tx, number input, number amount, Uint8Array per_commitment_key, HTLCOutputInCommitment htlc) {
		number ret = bindings.Sign_sign_justice_transaction(this.ptr, justice_tx, input, amount, per_commitment_key, htlc == null ? 0 : htlc.ptr & ~1);
		Result_SignatureNoneZ ret_hu_conv = Result_SignatureNoneZ.constr_from_ptr(ret);
		this.ptrs_to.add(htlc);
		return ret_hu_conv;
	}

	public Result_SignatureNoneZ sign_counterparty_htlc_transaction(Uint8Array htlc_tx, number input, number amount, Uint8Array per_commitment_point, HTLCOutputInCommitment htlc) {
		number ret = bindings.Sign_sign_counterparty_htlc_transaction(this.ptr, htlc_tx, input, amount, per_commitment_point, htlc == null ? 0 : htlc.ptr & ~1);
		Result_SignatureNoneZ ret_hu_conv = Result_SignatureNoneZ.constr_from_ptr(ret);
		this.ptrs_to.add(htlc);
		return ret_hu_conv;
	}

	public Result_SignatureNoneZ sign_closing_transaction(Uint8Array closing_tx) {
		number ret = bindings.Sign_sign_closing_transaction(this.ptr, closing_tx);
		Result_SignatureNoneZ ret_hu_conv = Result_SignatureNoneZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	public Result_SignatureNoneZ sign_channel_announcement(UnsignedChannelAnnouncement msg) {
		number ret = bindings.Sign_sign_channel_announcement(this.ptr, msg == null ? 0 : msg.ptr & ~1);
		Result_SignatureNoneZ ret_hu_conv = Result_SignatureNoneZ.constr_from_ptr(ret);
		this.ptrs_to.add(msg);
		return ret_hu_conv;
	}

	public void ready_channel(ChannelTransactionParameters channel_parameters) {
		bindings.Sign_ready_channel(this.ptr, channel_parameters == null ? 0 : channel_parameters.ptr & ~1);
		this.ptrs_to.add(channel_parameters);
	}

	public Uint8Array write() {
		Uint8Array ret = bindings.Sign_write(this.ptr);
		return ret;
	}

	public ChannelPublicKeys get_pubkeys() {
		number ret = bindings.Sign_get_pubkeys(this.ptr);
		const ret_hu_conv: ChannelPublicKeys = new ChannelPublicKeys(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public Sign clone() {
		number ret = bindings.Sign_clone(this.ptr);
		Sign ret_hu_conv = new Sign(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

}
