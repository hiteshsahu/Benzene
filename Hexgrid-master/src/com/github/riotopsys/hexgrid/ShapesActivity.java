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

public class ShapesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((ImageView) findViewById(R.id.triangle))
				.setBackgroundDrawable(new PolygonalDrwable(Color.GREEN, 3));

		((ImageView) findViewById(R.id.square))
				.setBackgroundDrawable(new PolygonalDrwable(Color.MAGENTA, 4));

		((ImageView) findViewById(R.id.pentagon))
				.setBackgroundDrawable(new PolygonalDrwable(Color.LTGRAY, 5));

		((ImageView) findViewById(R.id.hex))
				.setBackgroundDrawable(new PolygonalDrwable(Color.RED, 6));

		((ImageView) findViewById(R.id.hept))
				.setBackgroundDrawable(new PolygonalDrwable(Color.MAGENTA, 7));

		((ImageView) findViewById(R.id.oct))
				.setBackgroundDrawable(new PolygonalDrwable(Color.YELLOW, 8));
	}

}
