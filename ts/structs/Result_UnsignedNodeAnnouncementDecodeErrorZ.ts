
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class Result_UnsignedNodeAnnouncementDecodeErrorZ extends CommonBase {
	private Result_UnsignedNodeAnnouncementDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_UnsignedNodeAnnouncementDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_UnsignedNodeAnnouncementDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_UnsignedNodeAnnouncementDecodeErrorZ_result_ok(ptr)) {
			return new Result_UnsignedNodeAnnouncementDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_UnsignedNodeAnnouncementDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_UnsignedNodeAnnouncementDecodeErrorZ_OK extends Result_UnsignedNodeAnnouncementDecodeErrorZ {
		public final UnsignedNodeAnnouncement res;
		private Result_UnsignedNodeAnnouncementDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number res = bindings.LDKCResult_UnsignedNodeAnnouncementDecodeErrorZ_get_ok(ptr);
			const res_hu_conv: UnsignedNodeAnnouncement = new UnsignedNodeAnnouncement(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
	}

	public static final class Result_UnsignedNodeAnnouncementDecodeErrorZ_Err extends Result_UnsignedNodeAnnouncementDecodeErrorZ {
		public final DecodeError err;
		private Result_UnsignedNodeAnnouncementDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number err = bindings.LDKCResult_UnsignedNodeAnnouncementDecodeErrorZ_get_err(ptr);
			const err_hu_conv: DecodeError = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
	}

	public static Result_UnsignedNodeAnnouncementDecodeErrorZ constructor_ok(UnsignedNodeAnnouncement o) {
		number ret = bindings.CResult_UnsignedNodeAnnouncementDecodeErrorZ_ok(o == null ? 0 : o.ptr & ~1);
		Result_UnsignedNodeAnnouncementDecodeErrorZ ret_hu_conv = Result_UnsignedNodeAnnouncementDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	public static Result_UnsignedNodeAnnouncementDecodeErrorZ constructor_err(DecodeError e) {
		number ret = bindings.CResult_UnsignedNodeAnnouncementDecodeErrorZ_err(e == null ? 0 : e.ptr & ~1);
		Result_UnsignedNodeAnnouncementDecodeErrorZ ret_hu_conv = Result_UnsignedNodeAnnouncementDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	public Result_UnsignedNodeAnnouncementDecodeErrorZ clone() {
		number ret = bindings.CResult_UnsignedNodeAnnouncementDecodeErrorZ_clone(this.ptr);
		Result_UnsignedNodeAnnouncementDecodeErrorZ ret_hu_conv = Result_UnsignedNodeAnnouncementDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
