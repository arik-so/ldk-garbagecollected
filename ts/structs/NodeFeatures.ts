
            
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location



            export default class NodeFeatures extends CommonBase {
                constructor(_dummy: object, ptr: number) {
                    super(ptr);
                }

                
                protected finalize() {
                    super.finalize();

                    if (this.ptr != 0) {
                        bindings.NodeFeatures_free(this.ptr);
                    }
                }
	public NodeFeatures clone() {
		number ret = bindings.NodeFeatures_clone(this.ptr);
		const ret_hu_conv: NodeFeatures = new NodeFeatures(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	public static NodeFeatures constructor_empty() {
		number ret = bindings.NodeFeatures_empty();
		const ret_hu_conv: NodeFeatures = new NodeFeatures(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	public static NodeFeatures constructor_known() {
		number ret = bindings.NodeFeatures_known();
		const ret_hu_conv: NodeFeatures = new NodeFeatures(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	public Uint8Array write() {
		Uint8Array ret = bindings.NodeFeatures_write(this.ptr);
		return ret;
	}

	public static Result_NodeFeaturesDecodeErrorZ constructor_read(Uint8Array ser) {
		number ret = bindings.NodeFeatures_read(ser);
		Result_NodeFeaturesDecodeErrorZ ret_hu_conv = Result_NodeFeaturesDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
