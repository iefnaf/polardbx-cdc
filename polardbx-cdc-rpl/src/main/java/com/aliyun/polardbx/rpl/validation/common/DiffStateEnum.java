/**
 * Copyright (c) 2013-2022, Alibaba Group Holding Limited;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyun.polardbx.rpl.validation.common;

/**
 * Diff state
 *
 * @author siyu.yusi
 */
public enum DiffStateEnum {
    INIT(201),
    FIXED(202),
    RECHECKED(203);

    private final int value;

    DiffStateEnum(int value) {
        this.value = value;
    }

    public static DiffStateEnum from(int value) {
        switch (value) {
        case 201:
            return INIT;
        case 202:
            return FIXED;
        case 203:
            return RECHECKED;
        default:
            return null;
        }
    }

    public int getValue() {
        return value;
    }
}