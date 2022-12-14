/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.soloader;

import static android.util.Log.isLoggable;

import android.util.Log;

public class LogUtil {
  private LogUtil() {}

  /**
   * Send a {@link Log#ERROR} log message and log the exception.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or *
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   * @param tr An exception to log
   */
  public static void e(final String tag, final String msg, final Throwable tr) {
    if (isLoggable(tag, Log.ERROR)) {
      Log.e(tag, msg, tr);
    }
  }

  /**
   * Send an {@link Log#ERROR} log message.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   */
  public static void e(final String tag, final String msg) {
    if (isLoggable(tag, Log.ERROR)) {
      Log.e(tag, msg);
    }
  }

  /**
   * Send a {@link Log#WARN} log message and log the exception.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or *
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   * @param tr An exception to log
   */
  public static void w(final String tag, final String msg, final Throwable tr) {
    if (isLoggable(tag, Log.WARN)) {
      Log.w(tag, msg, tr);
    }
  }

  /**
   * Send a {@link Log#WARN} log message.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   */
  public static void w(final String tag, final String msg) {
    if (isLoggable(tag, Log.WARN)) {
      Log.w(tag, msg);
    }
  }

  /**
   * Send an {@link Log#INFO} log message and log the exception.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or *
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   * @param tr An exception to log
   */
  public static void i(final String tag, final String msg, final Throwable tr) {
    if (isLoggable(tag, Log.INFO)) {
      Log.i(tag, msg, tr);
    }
  }

  /**
   * Send an {@link Log#INFO} log message
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   */
  public static void i(final String tag, final String msg) {
    if (isLoggable(tag, Log.INFO)) {
      Log.i(tag, msg);
    }
  }

  /**
   * Send an {@link Log#DEBUG} log message and log the exception.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or *
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   * @param tr An exception to log
   */
  public static void d(final String tag, final String msg, final Throwable tr) {
    if (isLoggable(tag, Log.DEBUG)) {
      Log.d(tag, msg, tr);
    }
  }

  /**
   * Send an {@link Log#DEBUG} log message.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or *
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   */
  public static void d(final String tag, final String msg) {
    if (isLoggable(tag, Log.DEBUG)) {
      Log.d(tag, msg);
    }
  }

  /**
   * Send an {@link Log#VERBOSE} log message and log the exception.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or *
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   * @param tr An exception to log
   */
  public static void v(final String tag, final String msg, final Throwable tr) {
    if (isLoggable(tag, Log.VERBOSE)) {
      Log.v(tag, msg, tr);
    }
  }

  /**
   * Send an {@link Log#VERBOSE} log message.
   *
   * @param tag Used to identify the source of a log message. It usually identifies the class or *
   *     activity where the log call occurs.
   * @param msg The message you would like logged.
   */
  public static void v(final String tag, final String msg) {
    if (isLoggable(tag, Log.VERBOSE)) {
      Log.v(tag, msg);
    }
  }
}
