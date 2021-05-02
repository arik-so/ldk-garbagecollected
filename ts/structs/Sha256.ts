
            
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location



            export default class Sha256 extends CommonBase {
                constructor(_dummy: object, ptr: number) {
                    super(ptr);
                }

                
                protected finalize() {
                    super.finalize();

                    if (this.ptr != 0) {
                        bindings.Sha256_free(this.ptr);
                    }
                }
	public Sha256 clone() {
		number ret = bindings.Sha256_clone(this.ptr);
		const ret_hu_conv: Sha256 = new Sha256(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

}
