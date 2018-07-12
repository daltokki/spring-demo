package com.book.repository.value;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleType {
	ACTIVE_MEMBER("일반 사용자"), INACTIVE_MEMBER("휴면 사용자");

	private String desc;
}
