package org.wxportal.message.resp;

import java.util.Map;

public class MusicListResp extends AbstractBaseRespMessage {
	private MusicResp Music;

	public MusicResp getMusic() {
		return Music;
	}

	public void setMusic(MusicResp music) {
		Music = music;
	}

	@Override
	public String handlerData2ReturnXml(Map<String, Object> requestMap) {
		// TODO Auto-generated method stub
		return null;
	}
}
