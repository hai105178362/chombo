/*
 * chombo: Hadoop Map Reduce utility
 * Author: Pranab Ghosh
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.chombo.stats;

import org.chombo.util.BasicUtils;
import org.chombo.util.TypedObject;

/**
 * @author pranab
 *
 */
public class UniformIntSampler extends UniformSampler {
	private int min;
	private int max;
	
	/**
	 * @param min
	 * @param max
	 */
	public UniformIntSampler(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	@Override
	public TypedObject sample() {
		Integer sampled = BasicUtils.sampleUniform(min, max);
		return new TypedObject(sampled);
	}

}
