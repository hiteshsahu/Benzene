/**
 * Copyright 2013 C. A. Fitzgerald
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.github.riotopsys.hexgrid;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class GraphiteActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.graphite_sheet);

		((ImageView) findViewById(R.id.hex1))
				.setBackgroundDrawable(new PolygonalDrwable(Color.GREEN, 6));

		((ImageView) findViewById(R.id.hex2))
				.setBackgroundDrawable(new PolygonalDrwable(Color.GREEN, 6));

		((ImageView) findViewById(R.id.hex3))
				.setBackgroundDrawable(new PolygonalDrwable(Color.GREEN, 6));

		((ImageView) findViewById(R.id.hex4))
				.setBackgroundDrawable(new PolygonalDrwable(Color.GREEN, 6));

		((ImageView) findViewById(R.id.hex11))
				.setBackgroundDrawable(new PolygonalDrwable(Color.MAGENTA, 6));

		((ImageView) findViewById(R.id.hex12))
				.setBackgroundDrawable(new PolygonalDrwable(Color.MAGENTA, 6));

		((ImageView) findViewById(R.id.hex13))
				.setBackgroundDrawable(new PolygonalDrwable(Color.MAGENTA, 6));

		((ImageView) findViewById(R.id.hex21))
				.setBackgroundDrawable(new PolygonalDrwable(Color.YELLOW, 6));

		((ImageView) findViewById(R.id.hex22))
				.setBackgroundDrawable(new PolygonalDrwable(Color.YELLOW, 6));

		((ImageView) findViewById(R.id.hex23))
				.setBackgroundDrawable(new PolygonalDrwable(Color.YELLOW, 6));

		((ImageView) findViewById(R.id.hex24))
				.setBackgroundDrawable(new PolygonalDrwable(Color.YELLOW, 6));
	}

}
