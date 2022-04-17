// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An enum that represents a day of the week, weekdays, weekends, or all days.
 */
@Serializable
public enum class DynamicDayOfWeek(
	public val serialName: String,
) {
	@SerialName("Sunday")
	SUNDAY("Sunday"),
	@SerialName("Monday")
	MONDAY("Monday"),
	@SerialName("Tuesday")
	TUESDAY("Tuesday"),
	@SerialName("Wednesday")
	WEDNESDAY("Wednesday"),
	@SerialName("Thursday")
	THURSDAY("Thursday"),
	@SerialName("Friday")
	FRIDAY("Friday"),
	@SerialName("Saturday")
	SATURDAY("Saturday"),
	@SerialName("Everyday")
	EVERYDAY("Everyday"),
	@SerialName("Weekday")
	WEEKDAY("Weekday"),
	@SerialName("Weekend")
	WEEKEND("Weekend"),
	;

	public override fun toString(): String = serialName
}