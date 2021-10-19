
            
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location



            export default class Scorer extends CommonBase {
                constructor(_dummy: object, ptr: number) {
                    super(ptr);
                }

                
                protected finalize() {
                    super.finalize();

                    if (this.ptr != 0) {
                        bindings.Scorer_free(this.ptr);
                    }
                }
	public static Scorer constructor_new(number base_penalty_msat) {
		number ret = bindings.Scorer_new(base_penalty_msat);
		const ret_hu_conv: Scorer = new Scorer(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	public static Scorer constructor_default() {
		number ret = bindings.Scorer_default();
		const ret_hu_conv: Scorer = new Scorer(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	public Score as_Score() {
		number ret = bindings.Scorer_as_Score(this.ptr);
		Score ret_hu_conv = new Score(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

}
