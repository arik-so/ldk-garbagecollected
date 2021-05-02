
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

export default class SignOrCreationError extends CommonBase {
	protected constructor(_dummy: object, ptr: number) { super(ptr); }
	protected finalize() {
		super.finalize();
		if (this.ptr != 0) { bindings.SignOrCreationError_free(this.ptr); }
	}
	static constr_from_ptr(ptr: number): SignOrCreationError {
		const raw_val: bindings.LDKSignOrCreationError = bindings.LDKSignOrCreationError_ref_from_ptr(ptr);
		if (raw_val instanceof bindings.LDKSignOrCreationError.SignError) {
			return new SignError(this.ptr, raw_val);
		}
		if (raw_val instanceof bindings.LDKSignOrCreationError.CreationError) {
			return new CreationError(this.ptr, raw_val);
		}
		throw new Error('oops, this should be unreachable'); // Unreachable without extending the (internal) bindings interface
	}

}
export class SignError extends SignOrCreationError {
	private constructor(ptr: number, obj: bindings.LDKSignOrCreationError.SignError) {
		super(null, ptr);
	}
}
export class CreationError extends SignOrCreationError {
	public creation_error: LDKCreationError;
	private constructor(ptr: number, obj: bindings.LDKSignOrCreationError.CreationError) {
		super(null, ptr);
		this.creation_error = obj.creation_error;
	}
}
	public SignOrCreationError clone() {
		number ret = bindings.SignOrCreationError_clone(this.ptr);
		SignOrCreationError ret_hu_conv = SignOrCreationError.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public String to_str() {
		String ret = bindings.SignOrCreationError_to_str(this.ptr);
		return ret;
	}

}
