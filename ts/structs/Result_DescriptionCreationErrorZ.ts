
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class Result_DescriptionCreationErrorZ extends CommonBase {
	private Result_DescriptionCreationErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_DescriptionCreationErrorZ_free(ptr); } super.finalize();
	}

	static Result_DescriptionCreationErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_DescriptionCreationErrorZ_result_ok(ptr)) {
			return new Result_DescriptionCreationErrorZ_OK(null, ptr);
		} else {
			return new Result_DescriptionCreationErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_DescriptionCreationErrorZ_OK extends Result_DescriptionCreationErrorZ {
		public final Description res;
		private Result_DescriptionCreationErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number res = bindings.LDKCResult_DescriptionCreationErrorZ_get_ok(ptr);
			const res_hu_conv: Description = new Description(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
	}

	public static final class Result_DescriptionCreationErrorZ_Err extends Result_DescriptionCreationErrorZ {
		public final CreationError err;
		private Result_DescriptionCreationErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			this.err = bindings.LDKCResult_DescriptionCreationErrorZ_get_err(ptr);
		}
	}

	public static Result_DescriptionCreationErrorZ constructor_ok(Description o) {
		number ret = bindings.CResult_DescriptionCreationErrorZ_ok(o == null ? 0 : o.ptr & ~1);
		Result_DescriptionCreationErrorZ ret_hu_conv = Result_DescriptionCreationErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	public static Result_DescriptionCreationErrorZ constructor_err(CreationError e) {
		number ret = bindings.CResult_DescriptionCreationErrorZ_err(e);
		Result_DescriptionCreationErrorZ ret_hu_conv = Result_DescriptionCreationErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	public Result_DescriptionCreationErrorZ clone() {
		number ret = bindings.CResult_DescriptionCreationErrorZ_clone(this.ptr);
		Result_DescriptionCreationErrorZ ret_hu_conv = Result_DescriptionCreationErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
