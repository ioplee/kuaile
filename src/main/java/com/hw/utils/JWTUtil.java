package com.hw.utils;/**
 * Created by robin on 2019/4/17.
 */

import io.jsonwebtoken.*;
import lombok.extern.slf4j.Slf4j;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * The type Jwt util.
 *
 * @author: Robin
 * @create: 2019 -04-17 15:01
 * @description: JWT 工具类
 */
@Slf4j
public class JWTUtil {

    /**
     * Parse jwt claims.
     *
     * @param jsonWebToken the json web token
     * @return the claims
     */
    public static Claims parseJWT(String jsonWebToken) {
        try {
            log.debug("tokenbody:"+Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(JWTConstant.AUDIENCE_BASE64_SECRET))
                    .parseClaimsJws(jsonWebToken));
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(JWTConstant.AUDIENCE_BASE64_SECRET))
                    .parseClaimsJws(jsonWebToken).getBody();
            return claims;
        } catch (Exception e) {
            log.error("jwt解码异常： " + e.getMessage());
            return null;
        }
    }

    /**
     * Create jwt string.
     *
     * @param ip       the ip
     * @param userType the user type
     * @param userID   the user id
     * @return the string
     */
    public static String createJWT(String ip, Integer userType, Long userID) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //生成签名密钥
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(JWTConstant.AUDIENCE_BASE64_SECRET);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        //添加构成JWT的参数
        JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT")
                .claim("ip", ip)
                .claim("userID", userID)
                .claim("userType", userType)
                .setIssuer(JWTConstant.AUDIENCE_NAME)
                .setAudience(JWTConstant.AUDIENCE_CLIENT_ID)
                .signWith(signatureAlgorithm, signingKey);
        //添加Token过期时间
        if (JWTConstant.AUDIENCE_EXPIRES_SECOND > 0) {
            long expMillis = nowMillis + JWTConstant.AUDIENCE_EXPIRES_SECOND;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp).setNotBefore(now);
        }

        //生成JWT
        return builder.compact();
    }
}
