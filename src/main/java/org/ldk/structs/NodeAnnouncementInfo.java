package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * Information received in the latest node_announcement from this node.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class NodeAnnouncementInfo extends CommonBase {
	NodeAnnouncementInfo(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.NodeAnnouncementInfo_free(ptr); }
	}

	/**
	 * Protocol features the node announced support for
	 */
	public NodeFeatures get_features() {
		long ret = bindings.NodeAnnouncementInfo_get_features(this.ptr);
		NodeFeatures ret_hu_conv = new NodeFeatures(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Protocol features the node announced support for
	 */
	public void set_features(NodeFeatures val) {
		bindings.NodeAnnouncementInfo_set_features(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	/**
	 * When the last known update to the node state was issued.
	 * Value is opaque, as set in the announcement.
	 */
	public int get_last_update() {
		int ret = bindings.NodeAnnouncementInfo_get_last_update(this.ptr);
		return ret;
	}

	/**
	 * When the last known update to the node state was issued.
	 * Value is opaque, as set in the announcement.
	 */
	public void set_last_update(int val) {
		bindings.NodeAnnouncementInfo_set_last_update(this.ptr, val);
	}

	/**
	 * Color assigned to the node
	 */
	public byte[] get_rgb() {
		byte[] ret = bindings.NodeAnnouncementInfo_get_rgb(this.ptr);
		return ret;
	}

	/**
	 * Color assigned to the node
	 */
	public void set_rgb(byte[] val) {
		bindings.NodeAnnouncementInfo_set_rgb(this.ptr, val);
	}

	/**
	 * Moniker assigned to the node.
	 * May be invalid or malicious (eg control chars),
	 * should not be exposed to the user.
	 */
	public byte[] get_alias() {
		byte[] ret = bindings.NodeAnnouncementInfo_get_alias(this.ptr);
		return ret;
	}

	/**
	 * Moniker assigned to the node.
	 * May be invalid or malicious (eg control chars),
	 * should not be exposed to the user.
	 */
	public void set_alias(byte[] val) {
		bindings.NodeAnnouncementInfo_set_alias(this.ptr, val);
	}

	/**
	 * Internet-level addresses via which one can connect to the node
	 */
	public void set_addresses(NetAddress[] val) {
		bindings.NodeAnnouncementInfo_set_addresses(this.ptr, Arrays.stream(val).mapToLong(val_conv_12 -> val_conv_12.ptr).toArray());
		/* TODO 2 NetAddress  */;
	}

	/**
	 * An initial announcement of the node
	 * Mostly redundant with the data we store in fields explicitly.
	 * Everything else is useful only for sending out for initial routing sync.
	 * Not stored if contains excess data to prevent DoS.
	 */
	public NodeAnnouncement get_announcement_message() {
		long ret = bindings.NodeAnnouncementInfo_get_announcement_message(this.ptr);
		NodeAnnouncement ret_hu_conv = new NodeAnnouncement(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * An initial announcement of the node
	 * Mostly redundant with the data we store in fields explicitly.
	 * Everything else is useful only for sending out for initial routing sync.
	 * Not stored if contains excess data to prevent DoS.
	 */
	public void set_announcement_message(NodeAnnouncement val) {
		bindings.NodeAnnouncementInfo_set_announcement_message(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	/**
	 * Constructs a new NodeAnnouncementInfo given each field
	 */
	public static NodeAnnouncementInfo constructor_new(NodeFeatures features_arg, int last_update_arg, byte[] rgb_arg, byte[] alias_arg, NetAddress[] addresses_arg, NodeAnnouncement announcement_message_arg) {
		long ret = bindings.NodeAnnouncementInfo_new(features_arg == null ? 0 : features_arg.ptr & ~1, last_update_arg, rgb_arg, alias_arg, Arrays.stream(addresses_arg).mapToLong(addresses_arg_conv_12 -> addresses_arg_conv_12.ptr).toArray(), announcement_message_arg == null ? 0 : announcement_message_arg.ptr & ~1);
		NodeAnnouncementInfo ret_hu_conv = new NodeAnnouncementInfo(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		ret_hu_conv.ptrs_to.add(features_arg);
		/* TODO 2 NetAddress  */;
		ret_hu_conv.ptrs_to.add(announcement_message_arg);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the NodeAnnouncementInfo
	 */
	public NodeAnnouncementInfo clone() {
		long ret = bindings.NodeAnnouncementInfo_clone(this.ptr);
		NodeAnnouncementInfo ret_hu_conv = new NodeAnnouncementInfo(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Serialize the NodeAnnouncementInfo object into a byte array which can be read by NodeAnnouncementInfo_read
	 */
	public byte[] write() {
		byte[] ret = bindings.NodeAnnouncementInfo_write(this.ptr);
		return ret;
	}

	/**
	 * Read a NodeAnnouncementInfo from a byte array, created by NodeAnnouncementInfo_write
	 */
	public static Result_NodeAnnouncementInfoDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.NodeAnnouncementInfo_read(ser);
		Result_NodeAnnouncementInfoDecodeErrorZ ret_hu_conv = Result_NodeAnnouncementInfoDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
