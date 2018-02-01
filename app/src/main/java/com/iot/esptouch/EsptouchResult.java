package com.iot.esptouch;

import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicBoolean;

public class EsptouchResult implements IEsptouchResult {

	private final boolean mIsSuc;
	private final String mBssid;
	private final InetAddress mInetAddress;
	private AtomicBoolean mIsCancelled;

	/**
		*���캯����esptouchresult
		*
		* @param�����Ƿ�esptouch����ִ�гɹ�
		* @param BSSID�豸BSSID
		* @param InetAddress���豸��IP��ַ
	 */
	public EsptouchResult(boolean isSuc, String bssid, InetAddress inetAddress) {
		this.mIsSuc = isSuc;
		this.mBssid = bssid;
		this.mInetAddress = inetAddress;
		this.mIsCancelled = new AtomicBoolean(false);
	}

	@Override
	public boolean isSuc() {
		return this.mIsSuc;
	}

	@Override
	public String getBssid() {
		return this.mBssid;
	}

	@Override
	public boolean isCancelled() {
		return mIsCancelled.get();
	}
	
	public void setIsCancelled(boolean isCancelled){
		this.mIsCancelled.set(isCancelled);
	}

	@Override
	public InetAddress getInetAddress() {
		return this.mInetAddress;
	}

}
