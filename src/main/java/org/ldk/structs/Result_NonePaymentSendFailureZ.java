package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

public class Result_NonePaymentSendFailureZ extends CommonBase {
	private Result_NonePaymentSendFailureZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_NonePaymentSendFailureZ_free(ptr); } super.finalize();
	}

	static Result_NonePaymentSendFailureZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_NonePaymentSendFailureZ_result_ok(ptr)) {
			return new Result_NonePaymentSendFailureZ_OK(null, ptr);
		} else {
			return new Result_NonePaymentSendFailureZ_Err(null, ptr);
		}
	}
	public static final class Result_NonePaymentSendFailureZ_OK extends Result_NonePaymentSendFailureZ {
		private Result_NonePaymentSendFailureZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
		}
		public Result_NonePaymentSendFailureZ_OK() {
			this(null, bindings.CResult_NonePaymentSendFailureZ_ok());
		}
	}

	public static final class Result_NonePaymentSendFailureZ_Err extends Result_NonePaymentSendFailureZ {
		public final PaymentSendFailure err;
		private Result_NonePaymentSendFailureZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_NonePaymentSendFailureZ_get_err(ptr);
			PaymentSendFailure err_hu_conv = PaymentSendFailure.constr_from_ptr(err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_NonePaymentSendFailureZ_Err(PaymentSendFailure err) {
			this(null, bindings.CResult_NonePaymentSendFailureZ_err(err.ptr));
		}
	}
}
