package com.ha.security;

import java.util.Map;

import com.ha.common.Define.PROVIDER;
import com.ha.exception.OAuth2AuthenticationProcessingException;
import com.ha.security.oauth2.provider.FacebookOAuth2UserInfo;
import com.ha.security.oauth2.provider.GithubOAuth2UserInfo;
import com.ha.security.oauth2.provider.GoogleOAuth2UserInfo;
import com.ha.security.oauth2.provider.KakaoOAuth2UserInfo2;
import com.ha.security.oauth2.provider.OAuth2UserInfo;

public class OAuth2UserInfoFactory {
	public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if(registrationId.equalsIgnoreCase(PROVIDER.GOOGLE.toString().toLowerCase())) {
            return new GoogleOAuth2UserInfo(attributes);
        }else if (registrationId.equalsIgnoreCase(PROVIDER.FACEBOOK.toString().toLowerCase())) {
            return new FacebookOAuth2UserInfo(attributes);
        }else if (registrationId.equalsIgnoreCase(PROVIDER.GITHUB.toString().toLowerCase())) {
            return new GithubOAuth2UserInfo(attributes);
        }else if(registrationId.equalsIgnoreCase(PROVIDER.KAKAO.toString().toLowerCase())) {
        	return new KakaoOAuth2UserInfo2(attributes);
        }else {
        	throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
