package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * A node_announcement message to be sent or received from a peer
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class NodeAnnouncement extends CommonBase {
	NodeAnnouncement(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.NodeAnnouncement_free(ptr); }
	}

	/**
	 * The signature by the node key
	 */
	public byte[] get_signature() {
		byte[] ret = bindings.NodeAnnouncement_get_signature(this.ptr);
		return ret;
	}

	/**
	 * The signature by the node key
	 */
	public void set_signature(byte[] val) {
		bindings.NodeAnnouncement_set_signature(this.ptr, val);
	}

	/**
	 * The actual content of the announcement
	 */
	public UnsignedNodeAnnouncement get_contents() {
		long ret = bindings.NodeAnnouncement_get_contents(this.ptr);
		UnsignedNodeAnnouncement ret_hu_conv = new UnsignedNodeAnnouncement(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * The actual content of the announcement
	 */
	public void set_contents(UnsignedNodeAnnouncement val) {
		bindings.NodeAnnouncement_set_contents(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	/**
	 * Constructs a new NodeAnnouncement given each field
	 */
	public static NodeAnnouncement constructor_new(byte[] signature_arg, UnsignedNodeAnnouncement contents_arg) {
		long ret = bindings.NodeAnnouncement_new(signature_arg, contents_arg == null ? 0 : contents_arg.ptr & ~1);
		NodeAnnouncement ret_hu_conv = new NodeAnnouncement(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		ret_hu_conv.ptrs_to.add(contents_arg);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the NodeAnnouncement
	 */
	public NodeAnnouncement clone() {
		long ret = bindings.NodeAnnouncement_clone(this.ptr);
		NodeAnnouncement ret_hu_conv = new NodeAnnouncement(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Serialize the NodeAnnouncement object into a byte array which can be read by NodeAnnouncement_read
	 */
	public byte[] write() {
		byte[] ret = bindings.NodeAnnouncement_write(this.ptr);
		return ret;
	}

	/**
	 * Read a NodeAnnouncement from a byte array, created by NodeAnnouncement_write
	 */
	public static Result_NodeAnnouncementDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.NodeAnnouncement_read(ser);
		Result_NodeAnnouncementDecodeErrorZ ret_hu_conv = Result_NodeAnnouncementDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
