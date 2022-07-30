package com.woowacourse.thankoo.coupon.presentation.dto;

import com.woowacourse.thankoo.common.dto.TimeResponse;
import com.woowacourse.thankoo.coupon.domain.MemberCoupon;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CouponDetailResponse {

    private CouponResponse coupon;
    private TimeResponse time;

    private CouponDetailResponse(final CouponResponse coupon, final TimeResponse time) {
        this.coupon = coupon;
        this.time = time;
    }

    public static CouponDetailResponse from(final MemberCoupon memberCoupon, final TimeResponse timeResponse) {
        return new CouponDetailResponse(CouponResponse.of(memberCoupon), timeResponse);
    }

    public static CouponDetailResponse of(final MemberCoupon memberCoupon) {
        return new CouponDetailResponse(CouponResponse.of(memberCoupon), null);
    }
}