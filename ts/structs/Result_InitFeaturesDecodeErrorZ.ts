
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class Result_InitFeaturesDecodeErrorZ extends CommonBase {
	private Result_InitFeaturesDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_InitFeaturesDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_InitFeaturesDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_InitFeaturesDecodeErrorZ_result_ok(ptr)) {
			return new Result_InitFeaturesDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_InitFeaturesDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_InitFeaturesDecodeErrorZ_OK extends Result_InitFeaturesDecodeErrorZ {
		public final InitFeatures res;
		private Result_InitFeaturesDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number res = bindings.LDKCResult_InitFeaturesDecodeErrorZ_get_ok(ptr);
			const res_hu_conv: InitFeatures = new InitFeatures(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_InitFeaturesDecodeErrorZ_OK(InitFeatures res) {
			this(null, bindings.CResult_InitFeaturesDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_InitFeaturesDecodeErrorZ_Err extends Result_InitFeaturesDecodeErrorZ {
		public final DecodeError err;
		private Result_InitFeaturesDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number err = bindings.LDKCResult_InitFeaturesDecodeErrorZ_get_err(ptr);
			const err_hu_conv: DecodeError = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_InitFeaturesDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_InitFeaturesDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
